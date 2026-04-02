package com.learning;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class TestingPerformance {
    @Test
    void testPerformance() {
        SortingArray array = new SortingArray();
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        assertTimeout(Duration.ofMillis(100),()-> array.sortingArray(arr));
    }
}
