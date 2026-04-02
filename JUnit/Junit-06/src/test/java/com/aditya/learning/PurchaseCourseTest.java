package com.aditya.learning;

import com.telusko.service.PurchaseCourse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PurchaseCourseTest {

    @Test
    void proceedWithCourse() {
        PurchaseCourse pc = new PurchaseCourse();
        assertTrue(pc.proceedWithCourse(new JavaCourse()));
    }
}