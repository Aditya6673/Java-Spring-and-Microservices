package com.aditya.jdbc;

import java.sql.*;

public class LaunchApp3 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // Load and register the JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Establish the connection
        String url = "jdbc:mysql://localhost:3306/jdbclearning";
        String username = "root";
        String password = "root123";
        Connection connect = DriverManager.getConnection(url, username, password);
        // Create a statement
        Statement st = connect.createStatement();
        // Execute the query
        String sql = "select * from studentInfo";
        ResultSet rs = st.executeQuery(sql);

        // process the result set
        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
        }
        //Close the connection
        rs.close();
        st.close();
        connect.close();
    }
}
