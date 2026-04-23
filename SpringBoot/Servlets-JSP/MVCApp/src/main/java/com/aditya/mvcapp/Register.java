package com.aditya.mvcapp;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet( "/register")
public class Register extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String city = request.getParameter("city");
        Model model = new Model();
        model.setName(name);
        model.setEmail(email);
        model.setPassword(password);
        model.setCity(city);
        int row = model.register();
        HttpSession session = request.getSession();
        session.setAttribute("name", name);

        if(row==0){
            response.sendRedirect("failure.jsp");
        }else{
            response.sendRedirect("success.jsp");
        }
    }
}