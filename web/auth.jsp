<%-- 
    Document   : auth
    Created on : 12 janv. 2022, 00:56:09
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html dir="ltr">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <!-- Tell the browser to be responsive to screen width -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        <!-- Favicon icon -->
        <link rel="icon" type="image/png" sizes="16x16" href="adminmart-master/assets/images/favicon.png">
        <title>Adminmart Template - The Ultimate Multipurpose admin template</title>
        <!-- Custom CSS -->
        <link href="adminmart-master/dist/css/style.min.css" rel="stylesheet">
        <script src="script/jquery-3.3.1.min.js" type="text/javascript"></script>
        <script src="script/auth.js" type="text/javascript"></script>
        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        
    <![endif]-->
    </head>

    <body>
        <div class="main-wrapper">
            <!-- ============================================================== -->
            <!-- Preloader - style you can find in spinners.css -->
            <!-- ============================================================== -->
            <div class="preloader">
                <div class="lds-ripple">
                    <div class="lds-pos"></div>
                    <div class="lds-pos"></div>
                </div>
            </div>
            <div class="auth-wrapper d-flex no-block justify-content-center align-items-center position-relative"
                 style="background:url(adminmart-master/assets/images/big/auth-bg.jpg) no-repeat center center;">
                <div class="col-lg-2 col-md-5 bg-white auth-box row">
                    <div class="p-3" align="center" >
                        <div class="text-center">
                            <img src="adminmart-master/assets/images/big/icon.png" alt="wrapkit">
                        </div>
                        <p class="text-center">Entrer votre nom d'utilisateur et votre mot de passe</p>
                        <form class="mt-4">
                            <div class="row">
                                <div class="col-lg-12">
                                    <div class="form-group">
                                        <label class="text-dark" >Nom d'utilisateur</label>
                                        <input class="form-control" id="username" type="text"
                                               placeholder="nom d'utilisateur">
                                    </div>
                                </div>
                                <div class="col-lg-12">
                                    <div class="form-group">
                                        <label class="text-dark" >Mot de passe</label>
                                        <input class="form-control" id="password" type="password"
                                               placeholder="mot de passe">
                                    </div>
                                </div>
                                <div class="col-lg-12 text-center">
                                    <input type="submit" class="btn btn-block btn-dark"  id="auth" value="connexion">
                                </div>                             
                            </div>
                        </form>
                    </div>
                </div>

            </div>
            <!-- ============================================================== -->
            <!-- Login box.scss -->
            <!-- ============================================================== -->
        </div>
        <!-- ============================================================== -->
        <!-- All Required js -->
        <!-- ============================================================== -->
        <script src="adminmart-master/assets/libs/jquery/dist/jquery.min.js "></script>
        <!-- Bootstrap tether Core JavaScript -->
        <script src="adminmart-master/assets/libs/popper.js/dist/umd/popper.min.js "></script>
        <script src="adminmart-master/assets/libs/bootstrap/dist/js/bootstrap.min.js "></script>
        <!-- ============================================================== -->
        <!-- This page plugin js -->
        <!-- ============================================================== -->
        <script>
            $(".preloader ").fadeOut();
        </script>
    </body>

</html>
