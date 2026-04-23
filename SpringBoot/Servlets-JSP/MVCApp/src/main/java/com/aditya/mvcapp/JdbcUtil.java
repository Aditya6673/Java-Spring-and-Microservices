package com.aditya.mvcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {
    public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String DB_URL = "jdbc:mysql://localhost:3306/jdbclearning";
    public static final String USER = "root";
    public static final String PASS = "root123";
    static{
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL,USER,PASS);
    }
    public static void close(Connection con, Statement stmt) throws SQLException{
        con.close();
        stmt.close();
    }
}
