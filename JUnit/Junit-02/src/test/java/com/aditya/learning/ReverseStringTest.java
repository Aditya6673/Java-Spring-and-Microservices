package com.aditya.learning;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {
    @Test
    public void testReverseString() {
        ReverseString rs = new ReverseString();
        String result = rs.reverseString("Hello");
        String expected = "olleH";
        assertEquals(expected,result);
    }
}
