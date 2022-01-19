/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import beans.Place;
import beans.Section;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.PlaceService;
import service.SectionService;

/**
 *
 * @author HP
 */
@WebServlet(name = "PlaceController", urlPatterns = {"/PlaceController"})
public class PlaceController extends HttpServlet {

    private PlaceService ps = new PlaceService();
    private SectionService ss = new SectionService();

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
                List<Place> places = ps.findAll();
                Gson json = new Gson();
                response.getWriter().write(json.toJson(places));

            } else if (request.getParameter("op").equals("delete")) {
                int id = Integer.parseInt(request.getParameter("id"));
                ps.delete(ps.findById(id));
                response.setContentType("application/json");
                List<Place> places = ps.findAll();
                Gson json = new Gson();
                response.getWriter().write(json.toJson(places));
                
            } else if (request.getParameter("op").equals("loadzone")) {
                response.setContentType("application/json");
                List<Section> sections = ss.findAll();
                Gson json = new Gson();
                response.getWriter().write(json.toJson(sections));
                
            } else if (request.getParameter("op").equals("liberer")) {
                int id = Integer.parseInt(request.getParameter("id"));
                ps.librer(id);
                response.setContentType("application/json");
                List<Place> places = ps.findAll();
                Gson json = new Gson();
                response.getWriter().write(json.toJson(places));
            }
            else if (request.getParameter("op").equals("occupe")) {
                int id = Integer.parseInt(request.getParameter("id"));
                ps.occupe(id);
                response.setContentType("application/json");
                List<Place> places = ps.findAll();
                Gson json = new Gson();
                response.getWriter().write(json.toJson(places));
            }
        } else {
            String numero = request.getParameter("numero");
            String etat = request.getParameter("etat");
            String code_section = request.getParameter("code_section");
            ps.create(new Place(numero, etat, code_section));
            response.setContentType("application/json");
            List<Place> places = ps.findAll();
            Gson json = new Gson();

            response.getWriter().write(json.toJson(places));
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
