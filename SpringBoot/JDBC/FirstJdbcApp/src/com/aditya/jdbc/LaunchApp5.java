package com.aditya.jdbc;

import java.sql.*;

public class LaunchApp5 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
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
        boolean status = st.execute(sql);

        // process the result set
        if(status){
            ResultSet rs = st.getResultSet();
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
            }
            rs.close();

        }
        else{
            int row = st.getUpdateCount();
            if(row==0){
                System.out.println("Operation failed");
            }
            else{
                System.out.println("Operation successful");
            }
        }
        //Close the connection
        st.close();
        connect.close();
    }
}
