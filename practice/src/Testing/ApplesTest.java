package Testing;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ApplesTest {
    Apples apple;

    @BeforeAll
    public static void beforeAll(){
        System.out.println("I will do tests");
    }
    @BeforeEach
    public void beforeEachTest(){
        System.out.println("before each");
    }
    @AfterEach
    public void afterEach(){
        System.out.println("after each test");
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("All tests done");
    }

    @Test
    public void getApple() {
    apple = new Apples();
    String actual = "apple";
    String old = apple.getApple();
    assertEquals(actual, old);
    }
}