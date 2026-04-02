package com.aditya.learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseStringTest {
    @Test
    public void testReverseString_OneWord() {
        ReverseString rs = new ReverseString();
        String result = rs.reverse("Hello");
        String expected = "olleH";
        assertEquals(expected,result);
    }
    @Test
    public void testReverseString_MultipleWords() {
        ReverseString rs = new ReverseString();
        String result = rs.reverse("My name is Aditya");
        String expected = "aytidA si eman yM";
        assertEquals(expected,result);
    }
}
