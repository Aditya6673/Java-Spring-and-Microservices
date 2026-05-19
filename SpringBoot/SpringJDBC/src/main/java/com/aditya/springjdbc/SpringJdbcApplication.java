package com.aditya.springjdbc;

import com.aditya.springjdbc.Model.Alien;
import com.aditya.springjdbc.Repository.AlienRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);
        Alien alien1 = context.getBean(Alien.class);
        alien1.setId(111);
        alien1.setName("Naveen");
        alien1.setTech("Java");
        AlienRepo repo = context.getBean(AlienRepo.class);
        repo.save(alien1);
        System.out.println(repo.findAll());
    }

}
