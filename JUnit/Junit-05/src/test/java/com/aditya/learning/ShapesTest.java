package com.aditya.learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShapesTest {

    @Test
    void computeSquareArea() {
        Shapes shapes = new Shapes();
        assertEquals(576, shapes.computeSquareArea(24));
    }

    @Test
    void computeSquareAreaWithZeroSide() {
        Shapes shapes = new Shapes();
        assertEquals(0, shapes.computeSquareArea(0));
    }

    @Test
    void computeSquareAreaWithNegativeSide() {
        Shapes shapes = new Shapes();
        assertEquals(25, shapes.computeSquareArea(-5));
    }

    @Test
    void computeSquareAreaWithLargeSide() {
        Shapes shapes = new Shapes();
        assertEquals(1e12, shapes.computeSquareArea(1e6));
    }

    @Test
    void computeCircleAreaWithPositiveRadius() {
        Shapes shapes = new Shapes();
        assertEquals(Math.PI * 25, shapes.computeCircleArea(5));
    }

    @Test
    void computeCircleAreaWithZeroRadius() {
        Shapes shapes = new Shapes();
        assertEquals(0, shapes.computeCircleArea(0));
    }

    @Test
    void computeCircleAreaWithNegativeRadius() {
        Shapes shapes = new Shapes();
        assertEquals(0, shapes.computeCircleArea(-5));
    }

    @Test
    void computeCircleAreaWithLargeRadius() {
        Shapes shapes = new Shapes();
        assertEquals(Math.PI * 1e12, shapes.computeCircleArea(1e6));
    }
}