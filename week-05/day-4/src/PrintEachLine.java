import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class PrintEachLine {
    public static void main(String[] args) throws IOException {
        // Write a program that opens a file called "my-file.txt", then prints
        //File file = new File("my-file.txt");
        Path filePath = Paths.get("my-file.txt");
        List <String> lines = Files.readAllLines(filePath);

        try {
            for (String line : lines){
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("unable to read the file");

        }

        // each line from the file.

        // If the program is unable to read the file (for example it does not exist),
        // then it should print the following error message: "Unable to read file: my-file.txt"

    }
}