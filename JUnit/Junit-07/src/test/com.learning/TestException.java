package com.learning;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;


public class TestException {
    @Test
    void testSortingArray_Exception() {
        int[] unsorted = null;
        assertThrows(NullPointerException.class,()-> new SortingArray().sortingArray(unsorted));

    }
}
