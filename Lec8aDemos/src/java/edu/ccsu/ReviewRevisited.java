/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cwilliam
 */
@WebServlet(name = "ReviewRevisited", urlPatterns = {"/ReviewRevisited"})
public class ReviewRevisited extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String name = request.getParameter("name");
            // If a name was entered add it to the database
            if (name != null && name.length() > 0) {
                // add insert code
            }
            String deleteName = request.getParameter("deleteName");
            if (deleteName !=null && deleteName.length()>0){
                // add delete code
            }
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ReviewRevisited</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<form action=\"ReviewRevisited\" method=\"GET\">");
            out.println("Person id: <input type=\"textbox\" name=\"id\"/><br/>");
            out.println("Enter a name: <input type=\"textbox\" name=\"name\"/><br/>");
            out.println("<input type=\"submit\" value=\"Add name\"/>");
            out.println("</form>");
            out.println("<form action=\"DeletePersonServlet\" method=\"POST\">");
            out.println("Enter a name to delete: <input type=\"textbox\" name=\"deleteName\"/><br/>");
            out.println("<input type=\"submit\" value=\"Delete name\"/>");
            out.println("</form>");
            out.println("Names:<br/>");
            out.println("<ul>");
            // add select code
            out.println("<li>" + name + "</li>");
            out.println("</ul>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
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
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
