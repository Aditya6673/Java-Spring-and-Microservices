package com.aditya.mvcapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Model {
    private String name;
    private String email;
    private String password;
    private String city;
    private Connection connect = null;
    private PreparedStatement psmt = null;



    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int register(){
        try{
            connect = JdbcUtil.getConnection();
            psmt = connect.prepareStatement("INSERT INTO personal_info (name, city, email, password) VALUES (?, ?, ?, ?)");
            psmt.setString(1, name);
            psmt.setString(2, city);
            psmt.setString(3, email);
            psmt.setString(4, password);
            return psmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
