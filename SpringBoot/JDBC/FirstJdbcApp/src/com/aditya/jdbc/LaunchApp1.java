package com.aditya.jdbc;
import java.sql.*;
public class LaunchApp1 {

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
        String sql = "insert into studentInfo(id,sname,sage,scity) values(1,'Aditya',25,'Mathura')";
        int row = st.executeUpdate(sql);

        // process the result set
        if(row==0){
            System.out.println("Record insertion failed");
        }
        else{
            System.out.println("Record insertion successful");
        }
        //Close the connection
        st.close();
        connect.close();
    }
}
