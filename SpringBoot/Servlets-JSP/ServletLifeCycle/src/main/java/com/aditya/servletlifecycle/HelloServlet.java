package com.aditya.servletlifecycle;

import java.io.*;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/hello-servlet")
public class HelloServlet extends HttpServlet {
    static{
        System.out.println("Servlet is loaded.....");
    }
    public HelloServlet() {
        System.out.println("Servlet is created.....");
    }

    public void init(ServletConfig config)throws ServletException {
        System.out.println("Servlet is initialized.....");
    }

    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("Service method to handle the request.....");
    }

    public void destroy() {
        System.out.println("Servlet is destroyed.....");
    }
}