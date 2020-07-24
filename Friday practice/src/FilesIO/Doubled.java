package FilesIO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt
        try {
            Path filepath = Paths.get("src/FilesIO/double.txt");
            List<String> lines = Files.readAllLines(filepath);
            ArrayList<String> newLines = new ArrayList<>();

            for (String line : lines) {
                String word = "";
                for (int i = 0; i < line.length(); i += 2) {
                    word += line.charAt(i);
                }
                System.out.println(word);
            }
        } catch (Exception e) {
            System.out.println("cant reach file");
        }
    }
}
