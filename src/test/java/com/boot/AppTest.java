package com.boot;

import com.boot.controller.StringController;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testApp() {
        StringController sc = new StringController();
        String result = sc.text();
        assertEquals(result, "I love Travel Port and would love a job");
    }
}