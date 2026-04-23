package com.aditya.registrationapp;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/signup")
public class Register extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, jakarta.servlet.ServletException {
        String name = request.getParameter("name");
        String city = request.getParameter("city");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbclearning", "root", "root123");
            PreparedStatement psmt = connect.prepareStatement("insert into personal_info (name, city, email, password)" + "values(?,?,?,?)");
            psmt.setString(1, name);
            psmt.setString(2, city);
            psmt.setString(3, email);
            psmt.setString(4, password);
            int rows = psmt.executeUpdate();
            if(rows > 0) {
                request.getRequestDispatcher("Redirect.jsp").forward(request, response);
            }
            else {
                response.getWriter().println("<h1>Data insertion failed</h1>");
            }
            psmt.close();
            connect.close();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }


    }
}