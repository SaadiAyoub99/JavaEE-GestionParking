/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import beans.Park;
import beans.Section;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.ParkService;
import service.SectionService;

/**
 *
 * @author HP
 */
@WebServlet(name = "ServiceController", urlPatterns = {"/ServiceController"})
public class ServiceController extends HttpServlet {

    private SectionService ss = new SectionService();
    private ParkService ps = new ParkService();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getParameter("op") != null) {
            if (request.getParameter("op").equals("load")) {
                response.setContentType("application/json");
                List<Section> sections = ss.findAll();
                Gson json = new Gson();
                response.getWriter().write(json.toJson(sections));

            } else if (request.getParameter("op").equals("delete")) {
                int id = Integer.parseInt(request.getParameter("id"));
                ss.delete(ss.findById(id));
                response.setContentType("application/json");
                List<Section> sections = ss.findAll();
                Gson json = new Gson();
                response.getWriter().write(json.toJson(sections));
                
            } else if (request.getParameter("op").equals("loadpark")) {
                response.setContentType("application/json");
                List<Park> parks = ps.findAll();
                Gson json = new Gson();
                response.getWriter().write(json.toJson(parks));
                
            } else if (request.getParameter("op").equals("update")) {
                int id = Integer.parseInt(request.getParameter("id"));
              //  Section s = ss.findById(id);
               String code = request.getParameter("code_section");
                
                ss.update(new Section(id,code));
                response.setContentType("application/json");
                List<Section> sections = ss.findAll();
                Gson json = new Gson();
                response.getWriter().write(json.toJson(sections));
            }
        } else {
            String code_section = request.getParameter("code_section");
            String nom_park = request.getParameter("nom_park");
            ss.create(new Section(code_section, nom_park));
            response.setContentType("application/json");
            List<Section> sections = ss.findAll();
            Gson json = new Gson();

            response.getWriter().write(json.toJson(sections));
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
