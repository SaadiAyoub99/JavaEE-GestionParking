<%-- 
    Document   : ListePlace
    Created on : 11 janv. 2022, 13:02:05
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <!-- Tell the browser to be responsive to screen width -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        <!-- Favicon icon -->
        <link rel="icon" type="image/png" sizes="16x16" href="assets/images/favicon.png">
        <title></title>
        <%@include file= "/include/css.jsp" %>
        <script src="script/jquery-3.3.1.min.js" type="text/javascript"></script>
        <script src="script/place.js" type="text/javascript"></script>
    </head>
    <body>
        <div id="main-wrapper" data-theme="light" data-layout="vertical" data-navbarbg="skin6" data-sidebartype="full"
             data-sidebar-position="fixed" data-header-position="fixed" data-boxed-layout="full">
            <%@include file="/include/header.jsp" %>
            <%@include file="/include/menu.jsp" %>
            <div class="page-wrapper">
                <div class="page-breadcrumb">
                    <div class="row">
                        <div class="col-7 align-self-center">
                            <h3 class="page-title text-truncate text-dark font-weight-medium mb-1">Dashboard</h3>
                            <div class="d-flex align-items-center">
                                <nav aria-label="breadcrumb">
                                    <ol class="breadcrumb m-0 p-0">
                                    </ol>
                                </nav>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="container-fluid">
                    <div class="row">
                    </div>                  
                    <div class="row">
                        <div class="col-lg-6">
                            <div class="card">
                                <div class="card-body">
                                    <h4 class="card-title"><U>Liste des Places</U></h4>
                                    <br>
                                    <div class="table-responsive">
                                        <table class="table table-hover table-info">
                                            <thead class="bg-info text-white">
                                                <tr>
                                                    <th scope="col">Id</th>
                                                    <th scope="col">Numero</th>
                                                    <th scope="col">Etat</th>
                                                    <th scope="col">Section</th>
                                                    <th scope="col">Supprimer</th>
                                                    <th scope="col">Librer</th>
                                                    <th scope="col">Occuper</th>
                                                </tr>
                                            </thead>         
                                            <tbody id="content">
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <fieldset>
                        <div class="row">
                            <div class="col-12">
                                <div class="card">
                                    <div class="card-body">
                                        <h4 class="card-title"><U>Gérer Les Sections De Votre Park</U></h4>
                                        <br>                 
                                        <div class="form-body">                                           
                                            <div class="form-group row">
                                                <label class="col-md-2">Numero</label>
                                                <div class="col-md-10">
                                                    <div class="row">     
                                                        <div class="col-md-4">
                                                            <div class="form-group">
                                                                <input id="numero" type="text" class="form-control" value="" required=""
                                                                       placeholder="Indiquer Le Numero de Place" name="numero">
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <label class="col-md-2">Affecter au Section</label>
                                                <div class="col-md-10">
                                                    <div class="row">     
                                                        <div class="col-md-4">
                                                            <div class="form-group">                                                            
                                                                    <!--<div class="dropdown-menu" id="zone">                                                                      
                                                                    </div>-->
                                                                    <select  class="btn btn-secondary dropdown-toggle dropdown-toggle-split"  aria-label="Default select example" id="zone">
                                                                        <option>Open this select menu</option>                                                                                                  
                                                                    </select>
                                                             
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="form-actions">
                                            <div class="text-right">
                                                <button id="mod" type="submit" class="btn btn-warning" >Modifier</button>
                                                <button id="add" type="submit" class="btn waves-effect waves-light btn-success" >Ajouter</button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </fieldset>
                    <%@include file="/include/footer.jsp" %>
                </div>
            </div>
        </div>
        <%@include file="/include/js.jsp" %>
    </body>
</html>
