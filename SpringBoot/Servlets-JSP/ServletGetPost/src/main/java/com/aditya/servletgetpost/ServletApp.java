package com.aditya.servletgetpost;

import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/servlet")
public class ServletApp extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");

        request.setAttribute("name", name);
        request.setAttribute("email", email);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/registerSuccess.jsp");
        dispatcher.forward(request, response);
    }

}