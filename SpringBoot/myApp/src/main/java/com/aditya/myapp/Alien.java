package com.aditya.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Autowired // field injection
    @Qualifier("laptop")
    private Computer comp;

//    public Alien(Laptop lap){   // Constructor injection
//        this.lap = lap;
//    }
//    @Autowired
//    public void setLap(Laptop lap){
//        this.lap = lap;
//    }

    public void build(){
        comp.compile();

        System.out.println("Working on project .....");
    }
}
