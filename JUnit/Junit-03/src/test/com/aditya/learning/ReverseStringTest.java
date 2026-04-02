package com.aditya.learning;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ReverseStringTest {
    @Test
    public void testReverse() {
        ReverseString rs = new ReverseString();
        String result = rs.reverse("Hello");
        String expected = "olleH";
        assertEquals(expected,result);

    }

}
