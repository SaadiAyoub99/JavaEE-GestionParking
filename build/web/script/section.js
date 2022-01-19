/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function () {
    var id;
    $("#mod").hide();
    $.ajax({
        url: "ServiceController",
        data: {op: "load"},
        type: 'POST',
        success: function (data, textStatus, jqXHR) {
            remplir(data);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log(textStatus);
        }
    });

    $.ajax({
        url: "ServiceController",
        data: {op: "loadpark"},
        type: 'POST',
        success: function (data, textStatus, jqXHR) {
            remplirpark(data);

        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log(textStatus);
        }
    });

    $("#add").click(function () {
        var code = $("#code").val();
        var nom = $("#park").val();
        $.ajax({
            url: "ServiceController",
            data: {code_section: code, nom_park: nom},
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
            url: "ServiceController",
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
        var code = $("#code").val(name);

        $("#mod").show();

    });

    $("#mod").click(function () {

        var code = $("#code").val();
       
   console.log(id,code);
        $.ajax({
            url: "ServiceController",
            data: {op: "update", id: id, code_section: code},
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
            ligne += "<tr><td>" + e.id_section + "</td><td>" + e.code_section + "</td><td>" + e.nom_park + "</td><td><button type='reset' class='btn waves-effect waves-light btn-danger delete' >Supprimer</button></td><td><button type='submit' class='btn waves-effect waves-light  btn-primary update' >Modifier</td></tr>";
        });
        $("#content").html(ligne);
    }

    function remplirpark(data) {
        var ligne = "";
        data.forEach(function (e) {
            ligne += "<option value='" + e.nom_park + "'>" + e.nom_park + "</option>";
        });
        $("#park").html(ligne);
    }
});

