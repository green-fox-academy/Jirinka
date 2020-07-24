package com.company;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ApplesTest2 {
    Apples apple;

    @BeforeAll
    public static void beforeAllTests(){
        System.out.println("I will do tests");
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("All tests were DONE");
    }
    @BeforeEach
    public void beforeEachTest(){
        apple = new Apples();
    }
    @AfterEach
    public void afterEach(){
        System.out.println("Test was done");
    }

    @Test
    void getApple() {
        String actual = apple.getApple();
        String expected = "apple";
        assertEquals(expected, actual);

    }




}