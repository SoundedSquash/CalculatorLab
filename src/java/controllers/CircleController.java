/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import static java.lang.System.out;
import java.text.DecimalFormat;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.CalculatorService;

/**
 *
 * @author kanst_000
 */
@WebServlet(name = "CircleController", urlPatterns = {"/circle"})
public class CircleController extends HttpServlet {
private static final String RESULT_PAGE = "circle.jsp";
private static final String TYPE = "type";
private static final String SIZE = "size";
private static final String AREA = "area";
private static final String DECIMAL_FORMAT = "0.####";
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
        response.setContentType("text/html;charset=UTF-8");
        try {
            /* TODO output your page here. You may use following sample code. */
            String type = request.getParameter(TYPE);
            String size = request.getParameter(SIZE);
            
            CalculatorService rs = new CalculatorService();
            DecimalFormat df = new DecimalFormat(DECIMAL_FORMAT);
            double area = rs.getCircleArea(type, size);
            size = df.format(rs.getCircleRadius(type, size));
            request.setAttribute(TYPE, type);
            request.setAttribute(SIZE, size);
            request.setAttribute(AREA, df.format(area));
            
            RequestDispatcher view =
                request.getRequestDispatcher(RESULT_PAGE);
        view.forward(request, response);
        } catch(IOException | NumberFormatException | ServletException e){
            out.print(e);
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
