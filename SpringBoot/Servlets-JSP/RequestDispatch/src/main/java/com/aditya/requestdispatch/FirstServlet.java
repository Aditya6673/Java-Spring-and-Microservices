package com.aditya.requestdispatch;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/firstServlet")
public class FirstServlet extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("First Servlet");
        String name = request.getParameter("name");
        String email = request.getParameter("email");

        RequestDispatcher dispatch = request.getRequestDispatcher("/secondServlet");
        HttpSession session = request.getSession();
        session.setAttribute("name", name);
        session.setAttribute("email", email);
        session.setMaxInactiveInterval(10);
         dispatch.forward(request, response);
//        dispatch.include(request, response);
        response.getWriter().println("<h1>Response from First Servlet</h1>");
    }
}