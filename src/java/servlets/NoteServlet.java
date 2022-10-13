/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author muham
 */
@WebServlet(name = "NoteServlet", urlPatterns = {"/NoteServlet"})
public class NoteServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String editLink = request.getParameter("edit");

        //if (saveButton != null) {
        //}
        if (editLink != null) {

            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);

        } else {
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);

        }

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
        
        

        String saveButton = request.getParameter("save");
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
        
        Note note = new Note(title, content);
        request.setAttribute("note", note);

        if (saveButton != null) {
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
             
        }

        

    }

}
