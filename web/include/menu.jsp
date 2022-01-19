<%-- 
    Document   : menu
    Created on : 9 janv. 2022, 16:30:26
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<aside class="left-sidebar" data-sidebarbg="skin6">
    <!-- Sidebar scroll-->
    <div class="scroll-sidebar" data-sidebarbg="skin6">
        <!-- Sidebar navigation-->
        <nav class="sidebar-nav">
            <ul id="sidebarnav">
                <li class="list-divider"></li>
                <li class="nav-small-cap"><span class="hide-menu">Dashboard</span></li>
                </li>     
             <li class="sidebar-item"> <a href="ListePark.jsp" class="sidebar-link">
                        <i class="fas fa-calculator"></i><span
                            class="hide-menu">Gestion Parcking </span></a>
                </li>
                <li class="sidebar-item"> <a  href="ListeSection.jsp"  aria-expanded="false" class="sidebar-link">
                        <i class="fas fa-building"></i><span
                            class="hide-menu">Gestion Sections </span></a>
                </li> 
                <li class="sidebar-item"> <a class="sidebar-link sidebar-link" href="ListePlace.jsp" class="sidebar-link">
                        <i class="fas fa-fax"></i><span
                            class="hide-menu">Gestion Places </span></a>
                </li>

                <li class="sidebar-item"> <a class="sidebar-link sidebar-link" href="auth.jsp"
                                             aria-expanded="false"><i data-feather="log-out" class="feather-icon"></i><span
                            class="hide-menu">Logout</span></a></li>
            </ul>
        </nav>
    </div>
</aside>