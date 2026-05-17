package com.aditya.demorest;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class AlienRepository
{
    List<Alien> aliens;
    Connection con = null;
    public AlienRepository()
    {
        String url = "jdbc:mysql://localhost:3306/restdb";
        String user = "root";
        String password = "root123";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
    public List<Alien> getAliens()
    {
        aliens = new ArrayList<>();
        String sql = "select * from alien";
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                Alien a = new Alien();
                a.setId(rs.getInt(1));
                a.setName(rs.getString(2));
                a.setPoints(rs.getInt(3));
                aliens.add(a);
            }
        } catch (java.lang.Exception e) {
            throw new RuntimeException(e);
        }
        return aliens;
    }
    public Alien getAlien(int id)
    {
        aliens = new ArrayList<>();
        Alien a = null;
        String sql = "select * from alien where id = "+id;
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                a = new Alien();
                a.setId(rs.getInt(1));
                a.setName(rs.getString(2));
                a.setPoints(rs.getInt(3));
                aliens.add(a);
            }
        } catch (java.lang.Exception e) {
            throw new RuntimeException(e);
        }
        return a;
    }

    public void createAlien(Alien a1) {
        String sql = "insert into alien values (?,?,?)";
        try{
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1,a1.getId());
            st.setString(2,a1.getName());
            st.setInt(3,a1.getPoints());
            st.executeUpdate();
        } catch (java.lang.Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void updateAlien(Alien a1) {
        String sql = "update alien set name = ?, points = ? where id = ?";
        try{
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1,a1.getName());
            st.setInt(2,a1.getPoints());
            st.setInt(3,a1.getId());
            st.executeUpdate();
        } catch (java.lang.Exception e) {
            System.out.println(e);
        }
    }
    public void delete(int id){
        String sql = "delete from alien where id = "+id;
        try{
            Statement st = con.createStatement();
            st.executeUpdate(sql);
        } catch (java.lang.Exception e) {
            throw new RuntimeException(e);
        }
    }
}
