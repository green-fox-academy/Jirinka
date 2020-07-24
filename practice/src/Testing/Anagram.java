package Testing;

import org.testng.reporters.jq.Main;
import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String string1 = "Green Fox";
        String string2 = "En Ex Frog";

        String newS = string1.toLowerCase();

        System.out.println(newS);

        //isAnagram(string1,string2);
        //System.out.println(isAnagram(string1,string2));
    }

    public boolean isAnagram(String string1, String string2) {
        String newString1 = string1.toLowerCase().replaceAll("\\s", "");
        String newString2 = string2.toLowerCase().replaceAll("\\s", "");

        char[] array1 = newString1.toCharArray();
        char[] array2 = newString2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1,array2);
    }

}



