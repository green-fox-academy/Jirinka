package FilesIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {

        try {
            Path filePath = Paths.get("src/FilesIO/my-file.txt");
            List<String> lines = Files.readAllLines(filePath);
            for (String line: lines) {
                System.out.println(line);
            }
        } catch (Exception e){
            System.out.println("unable to read my-file.txt");
        }




}
}
