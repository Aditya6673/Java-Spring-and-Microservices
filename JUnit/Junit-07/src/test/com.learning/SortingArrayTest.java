package com.learning;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SortingArrayTest {
    SortingArray array;
    SortingArrayTest(){
        System.out.println("Constructor");
    }
    @BeforeAll
    static void setUp(){
        System.out.println("Before All");
    }
    @BeforeEach
    void init(){
        array = new SortingArray();
        System.out.println("Before Each");
    }
    @Test
    void sortingArray_Numbers() {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        assertArrayEquals(arr,array.sortingArray(arr));
        System.out.println("Test Case 1");
    }
    @Test
    void sortingArray_Strings(){
        int[] arr = {'a','b','c','d','e','f','g','h','i','j'};
        assertArrayEquals(arr,array.sortingArray(arr));
        System.out.println("Test Case 2");

    }
    @AfterEach
    void tearDown(){
        array = null;
        System.out.println("After Each");
    }
    @AfterAll
    static void tearDownAfterClass(){
        System.out.println("After All");
    }
}