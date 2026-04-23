package com.aditya.requestdispatch;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/secondServlet")
public class SecondServlet extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("Second Servlet");
        HttpSession session = request.getSession(false);
        String name = session.getAttribute("name").toString();
        String email = session.getAttribute("email").toString();
        response.getWriter().println("<h1>Response from Second Servlet</h1>");
        response.getWriter().println("<h2>Name: " + name + "</h2>");
        response.getWriter().println("<h2>Email: " + email + "</h2>");
    }
}