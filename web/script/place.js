/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function () {

    var id;
    $("#mod").hide();
    $.ajax({
        url: "PlaceController",
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
        url: "PlaceController",
        data: {op: "loadzone"},
        type: 'POST',
        success: function (data, textStatus, jqXHR) {
            remplirzone(data);

        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log(textStatus);
        }
    });

    $("#add").click(function () {
        var numero = $("#numero").val();
        var etat = $("#etat").val();
        var code = $("#zone").val();

        $.ajax({
            url: "PlaceController",
            data: {numero: numero, etat: etat, code_section: code},
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
            url: "PlaceController",
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

    $("#content").on("click", ".liberer", function () {

        id = $(this).closest("tr").find("td").eq(0).text();
        $.ajax({
            url: "PlaceController",
            data: {op: "liberer", id: id},
            type: 'POST',
            success: function (data, textStatus, jqXHR) {
                remplir(data);
            },
            error: function (jqXHR, textStatus, errorThrown) {
                console.log(textStatus);
            }
        });

    });
     $("#content").on("click", ".occupe", function () {

        id = $(this).closest("tr").find("td").eq(0).text();
        $.ajax({
            url: "PlaceController",
            data: {op: "occupe", id: id},
            type: 'POST',
            success: function (data, textStatus, jqXHR) {
                remplir(data);
            },
            error: function (jqXHR, textStatus, errorThrown) {
                console.log(textStatus);
            }
        });

    });
    $("#mod").click(function () {
        console.log(id);
        var numero = $("#numero").val();
        var etat = $("#etat").val();
        var code = $("#zone").val();

        $.ajax({
            url: "PlaceController",
            data: {op: "update", id: id, numero: numero, etat: etat, code_section: code},
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
            var etat;
            if (e.etat==true) {
                etat = "Occupée";
            } else if (e.etat==false) {
                etat = "Libre";
            }
            ligne += "<tr><td>" + e.id + "</td><td>" + e.numero + "</td><td>" + etat + "</td><td>" + e.code_section + "</td><td><button type='reset' class='btn waves-effect waves-light btn-danger delete' >Supprimer</button></td><td><button type='submit' class='btn waves-effect waves-light btn-light liberer' >Libre</td><td><button type='submit' class='btn waves-effect waves-light btn-dark occupe' >Occupée</td></tr>";
        });
        $("#content").html(ligne);
    }



    function remplirzone(data) {
        var ligne = "";
        data.forEach(function (e) {
            ligne += "<option value='" + e.code_section + "'>" + e.code_section + "</option>";
        });
        $("#zone").html(ligne);
    }







































});

