package com.telusko.service;
import com.aditya.learning.Course;
public class PurchaseCourse {
    private Course course;
    public boolean proceedWithCourse(Course course){
        return course.coursePurchased();
    }

}
