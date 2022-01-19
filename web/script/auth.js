/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {
    $("#auth").click(function () {
      var username = $('#username').val();
        var password = $('#password').val();
        
        if(username=="")
    {    alert('Taper votre username !!!');
        }
        else if(password=="")
        {
            alert('Taper votre password !!!');
        }else
        {
        $.ajax({
                url: "LoginController",
                data: {op: "login", username:username , password:password  },
                type: 'POST',
                success: function (data, textStatus, jqXHR) {
                    if(data === "1"){
                        window.location.replace("ListePark.jsp");
                    }

                    if(data === "3"){
                        $('#err').hide().html("Username or Password incorrect !!").fadeIn("slow");
                    }
                },
                error: function (jqXHR, textStatus, errorThrown) {
                    console.log(textStatus);
                }
            });
        }
    });
});

