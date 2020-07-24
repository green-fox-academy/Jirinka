package FilesIO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
    public static void main(String[] args) {

// Create a function that takes 3 parameters: a path, a word and a number
// and is able to write into a file.
// The path parameter should be a string that describes the location of the file you wish to modify
// The word parameter should also be a string that will be written to the file as individual lines
// The number parameter should describe how many lines the file should have.
// If the word is 'apple' and the number is 5, it should write 5 lines
// into the file and each line should read 'apple'
// The function should not raise any errors if it could not write the file.

        //Path myFilePath = Paths.get("src/FilesIO/text.txt");
        writeToFile("src/FilesIO/text.txt", "apple", 5);

    }

    public static void writeToFile(String filepath, String word, int number) {
        try {
            Path filePath = Paths.get(filepath);

            List<String> words = Files.readAllLines(filePath);
            for (int i = 0; i < number; i++) {
                words.add(word);
            }
            Files.write(filePath, words);
        } catch (Exception e) {
            System.out.println("cant find file");
        }

    }
}
