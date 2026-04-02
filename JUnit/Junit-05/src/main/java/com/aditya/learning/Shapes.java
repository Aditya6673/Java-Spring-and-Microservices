package com.aditya.learning;

public class Shapes {
    public double computeSquareArea(double side) {
        return side * side;
    }
    public double computeCircleArea(double radius) {
        if (radius < 0) {
            return 0;
        }
        return Math.PI * radius * radius;
    }
}
