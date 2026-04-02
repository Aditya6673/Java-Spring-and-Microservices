package com.aditya.learning;

public class SpringBootCourse implements Course{
    @Override
    public boolean coursePurchased() {
        System.out.println("SpringBoot Course Purchased");
        return true;
    }
}
