package FilesIO;

import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class WriteSingleLine {
    public static void main(String[] args) {

        try {
            Path filename = Paths.get("src/FilesIO/my-file.txt");
            ArrayList<String> name = new ArrayList<>();
            name.add("Jirina");
            name.add("Martin");
            name.add("Matěj");
            Files.write(filename, name);


        } catch (Exception e){

        }
    }
}
