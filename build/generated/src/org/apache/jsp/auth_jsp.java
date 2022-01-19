package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class auth_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html dir=\"ltr\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <!-- Tell the browser to be responsive to screen width -->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <!-- Favicon icon -->\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"adminmart-master/assets/images/favicon.png\">\n");
      out.write("        <title>Adminmart Template - The Ultimate Multipurpose admin template</title>\n");
      out.write("        <!-- Custom CSS -->\n");
      out.write("        <link href=\"adminmart-master/dist/css/style.min.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"script/jquery-3.3.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"script/auth.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("        \n");
      out.write("    <![endif]-->\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"main-wrapper\">\n");
      out.write("            <!-- ============================================================== -->\n");
      out.write("            <!-- Preloader - style you can find in spinners.css -->\n");
      out.write("            <!-- ============================================================== -->\n");
      out.write("            <div class=\"preloader\">\n");
      out.write("                <div class=\"lds-ripple\">\n");
      out.write("                    <div class=\"lds-pos\"></div>\n");
      out.write("                    <div class=\"lds-pos\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"auth-wrapper d-flex no-block justify-content-center align-items-center position-relative\"\n");
      out.write("                 style=\"background:url(adminmart-master/assets/images/big/auth-bg.jpg) no-repeat center center;\">\n");
      out.write("                <div class=\"col-lg-2 col-md-5 bg-white auth-box row\">\n");
      out.write("                    <div class=\"p-3\" align=\"center\" >\n");
      out.write("                        <div class=\"text-center\">\n");
      out.write("                            <img src=\"adminmart-master/assets/images/big/icon.png\" alt=\"wrapkit\">\n");
      out.write("                        </div>\n");
      out.write("                        <p class=\"text-center\">Entrer votre nom d'utilisateur et votre mot de passe</p>\n");
      out.write("                        <form class=\"mt-4\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-lg-12\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"text-dark\" >Nom d'utilisateur</label>\n");
      out.write("                                        <input class=\"form-control\" id=\"username\" type=\"text\"\n");
      out.write("                                               placeholder=\"nom d'utilisateur\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-lg-12\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"text-dark\" >Mot de passe</label>\n");
      out.write("                                        <input class=\"form-control\" id=\"password\" type=\"password\"\n");
      out.write("                                               placeholder=\"mot de passe\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-lg-12 text-center\">\n");
      out.write("                                    <input type=\"submit\" class=\"btn btn-block btn-dark\"  id=\"auth\" value=\"connexion\">\n");
      out.write("                                </div>                             \n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- ============================================================== -->\n");
      out.write("            <!-- Login box.scss -->\n");
      out.write("            <!-- ============================================================== -->\n");
      out.write("        </div>\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- All Required js -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <script src=\"adminmart-master/assets/libs/jquery/dist/jquery.min.js \"></script>\n");
      out.write("        <!-- Bootstrap tether Core JavaScript -->\n");
      out.write("        <script src=\"adminmart-master/assets/libs/popper.js/dist/umd/popper.min.js \"></script>\n");
      out.write("        <script src=\"adminmart-master/assets/libs/bootstrap/dist/js/bootstrap.min.js \"></script>\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- This page plugin js -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <script>\n");
      out.write("            $(\".preloader \").fadeOut();\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
