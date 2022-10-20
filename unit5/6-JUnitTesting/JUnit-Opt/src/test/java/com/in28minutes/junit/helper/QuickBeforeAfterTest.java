package com.in28minutes.junit.helper;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class QuickBeforeAfterTest {

    @BeforeAll
    static void beforeClass() {
        System.out.println("Before class or everything. Must be a static method");
    }

    // runs before each test
    @BeforeEach
    void setup() {
        System.out.println("Before Test");
    }

    @Test
    void test1() {
        System.out.println("test1 executed");
    }

    @Test
    void test2() {
        System.out.println("test2 executed");
    }

    // Scenario: if a lot of data is created for the test
        // will want to tear it down or close the connect to a db when done
    @AfterEach
    void tearDown() {
        System.out.println("After test");
    }

    @AfterAll
    static void afterClass() {
        System.out.println("After everything or the class. Must be a static method.");
    }
}