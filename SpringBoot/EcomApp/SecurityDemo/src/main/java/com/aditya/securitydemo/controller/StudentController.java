package com.aditya.securitydemo.controller;

import com.aditya.securitydemo.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    private List<Student> students = new ArrayList<>(List.of(
            new Student(1,"Navin",60),
            new Student(2,"Kiran",65)
    ));
    @GetMapping("/students")
    public List<Student> getStudents(){
        return students;
    }
    @GetMapping("/csrf-token")
    public CsrfToken getToken(HttpServletRequest request){
        return request.getAttribute("_csrf") != null ? (CsrfToken) request.getAttribute("_csrf") : null;
    }
    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student){
        students.add(student);
        return student;
    }
}
