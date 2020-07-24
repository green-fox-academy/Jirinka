package Testing;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    Anagram anagram;

    @BeforeEach
    public void beforeEach(){

    }

    @AfterEach
    public void afterEach() {
        System.out.println("One test done");
    }

    @Test
    void isAnagram() {
    anagram = new Anagram();
    String string1 ="Green Fox";
    String string2 ="En Ex Frog";
    boolean actual = anagram.isAnagram(string1, string2);
    boolean expected = true;
    assertEquals(expected,actual);

    }
}