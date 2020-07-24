package com.company;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ApplesTest {
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
    public void getApple(){
        String actual = apple.getApple();
        String expected = "apple";
        assertEquals(expected, actual);
    }

}