package com.aditya.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LaunchApp6 {
    public static void main(String[] args) {
        Connection connect = null;
        Statement st = null;
        try {
            // Load and register the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            String url = "jdbc:mysql://localhost:3306/jdbclearning";
            String username = "root";
            String password = "root123";
            connect = DriverManager.getConnection(url, username, password);
            // Create a statement
            st = connect.createStatement();
            // Execute the query
            String sql = "insert into studentInfo(id,sname,sage,scity) values(2,'Jatin',26,'Mathura')";
            int row = st.executeUpdate(sql);

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
