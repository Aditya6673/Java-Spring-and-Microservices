package com.aditya.jdbc;

import java.sql.*;
import java.util.Scanner;

public class LaunchApp7 {
    public static void main(String[] args) {
        Connection connect = null;
        PreparedStatement st = null;
        try {
            // Load and register the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            String url = "jdbc:mysql://localhost:3306/jdbclearning";
            String username = "root";
            String password = "root123";
            connect = DriverManager.getConnection(url, username, password);
            // Create a statement
            String sql = "insert into studentInfo(id,sname,sage,scity) values(?, ?, ?, ?)";
            System.out.println("Enter the values");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the id");
            int id = sc.nextInt();
            System.out.println("Enter the name");
            String name = sc.next();
            System.out.println("Enter the age");
            int age = sc.nextInt();
            System.out.println("Enter the city");
            String city = sc.next();
            st = connect.prepareStatement(sql);
            st.setInt(1, id);
            st.setString(2, name);
            st.setInt(3, age);
            st.setString(4, city);
            // Execute the query

            int row = st.executeUpdate();

            // process the result set
            if (row == 0) {
                System.out.println("Record insertion failed");
            } else {
                System.out.println("Record insertion successful");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            //Close the connection
            try {
                st.close();
                connect.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
