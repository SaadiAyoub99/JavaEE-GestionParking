/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function () {
      var id;
    $("#mod").hide();
    $.ajax({
        url: "ParkController",
        data: {op: "load"},
        type: 'POST',
        success: function (data, textStatus, jqXHR) {
            remplir(data);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log(textStatus);
        }
    });
    
     $("#add").click(function () {
        var nom = $("#nom").val();
        $.ajax({
            url: "ParkController",
            data: {nom_park: nom},
            type: 'POST',
            success: function (data, textStatus, jqXHR) {
                remplir(data);
            },
            error: function (jqXHR, textStatus, errorThrown) {
                console.log(textStatus);
            }
        });

    });
    
    
    $("#content").on("click", ".delete", function () {
        var id = $(this).closest("tr").find("td").eq(0).text();
        $.ajax({
            url: "ParkController",
            data: {op: "delete", id: id},
            type: 'POST',
            success: function (data, textStatus, jqXHR) {
                remplir(data);
            },
            error: function (jqXHR, textStatus, errorThrown) {
                console.log(textStatus);
            }
        });

    });
    
       $("#content").on("click", ".update", function () {

        id = $(this).closest("tr").find("td").eq(0).text();
        var name = $(this).closest("tr").find("td").eq(1).text();
        var nom = $("#nom").val(name);

        $("#mod").show();

    });
    
       $("#mod").click(function () {
        ///console.log(id);
        var nom = $("#nom").val();

        $.ajax({
            url: "ParkController",
            data: {op: "update", id: id, nom_park: nom},
            type: 'POST',
            success: function (data, textStatus, jqXHR) {
                remplir(data);
            },
            error: function (jqXHR, textStatus, errorThrown) {
                console.log(textStatus);
            }
        });
        $("#mod").hide();
    });
    
     function remplir(data) {
        var ligne = "";
        data.forEach(function (e) {
            ligne += "<tr><td>" + e.id + "</td><td>" + e.nom_park + "</td><td><button type='reset' class='btn waves-effect waves-light btn-danger delete' >Supprimer</button></td><td><button type='submit' class='btn waves-effect waves-light btn-primary update' >Modifier</td></tr>";
        });
        $("#content").html(ligne);
    }
    

});

