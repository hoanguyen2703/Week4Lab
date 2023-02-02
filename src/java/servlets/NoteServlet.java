/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author khanhhoanguyen
 */
public class NoteServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        String title = br.readLine();
        String contents = br.readLine();
        br.close();

        Note note = new Note();
        note.setTitle(title);
        note.setContents(contents);
        request.setAttribute("note", note);

        request.getParameter("edit");
        
        if (request.getParameter("edit") != null) {
            request.getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        }
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
       String title = request.getParameter("title");
        String contents = request.getParameter("contents");

        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
        pw.println(title);
        pw.println(contents);
        pw.close();

        Note note = new Note();
        note.setTitle(title);
        note.setContents(contents);
        request.setAttribute("note", note);

        request.getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
    
    }

    

}
