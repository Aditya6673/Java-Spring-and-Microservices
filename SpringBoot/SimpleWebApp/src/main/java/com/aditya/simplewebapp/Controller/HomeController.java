package com.aditya.simplewebapp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
public class HomeController {
    @RequestMapping("/")
//    @ResponseBody
    public String greet() {
        System.out.println("Hello World!");
        return "Welcome to Spring Boot!";
    }
    @RequestMapping("/about")
    public String about(){
        return "This is a simple web application";
    }
}
