import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Function;

public class FileReaDemo {

    public static void main(String[] args) throws IOException {


        /*String fileName ="some.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }*/


        final Path path = Paths.get("./Files/resources/read-file.txt");
        final List<String> strings;
        try {
            strings = Files.readAllLines(path);
            System.out.println(strings);

        } catch (IOException e) {
            e.printStackTrace();
        }

        final Function<String, String> toUpperCase = String::toUpperCase;
        Files.lines(path).map(toUpperCase).forEach(System.out::println);




    }
}
