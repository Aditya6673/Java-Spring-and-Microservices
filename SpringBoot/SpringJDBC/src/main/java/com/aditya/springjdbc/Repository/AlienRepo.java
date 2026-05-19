package com.aditya.springjdbc.Repository;

import com.aditya.springjdbc.Model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AlienRepo {
    private JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }
    @Autowired
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public void save(Alien alien) {
        String sql = "INSERT INTO alien (id,name,tech) VALUES (?,?,?)";
        int rows = template.update(sql,alien.getId(),alien.getName(),alien.getTech());
        System.out.println(rows);
    }
    public List<Alien> findAll() {
        String sql = "SELECT * FROM alien";
        return template.query(sql,(rs,rowNum) -> {
            Alien a = new Alien();
            a.setId(rs.getInt("id"));
            a.setName(rs.getString("name"));
            a.setTech(rs.getString("tech"));
            return a;
        });
    }
}
