import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWrite {

    public static void main(String[] args) throws IOException {

        final Path path = Paths.get("./Files/resources/write-file.txt");

        final List<String> fruits = List.of("Apple", "Banana", "Mango");


     Files.write(path, fruits);

    }
}
