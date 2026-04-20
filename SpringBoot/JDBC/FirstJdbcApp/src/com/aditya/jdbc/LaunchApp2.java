package com.aditya.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LaunchApp2 {
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
        String sql = "update studentInfo set sage=23 where id=1";
        int row = st.executeUpdate(sql);

        // process the result set
        if(row==0){
            System.out.println("Record update failed");
        }
        else{
            System.out.println("Record update successful");
        }
        //Close the connection
        st.close();
        connect.close();
    }
}
