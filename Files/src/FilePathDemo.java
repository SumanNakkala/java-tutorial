import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Predicate;

import static java.lang.String.valueOf;

public class FilePathDemo {

    public static void main(String[] args) throws IOException {


         Path path = Paths.get("./Files");
        System.out.println("The Path is : " + path);
        // Directories
         //. current directory

        Files.list(path).forEach(x -> System.out.println(x));

        Predicate<? super Path> predicate = pathV -> String.valueOf(pathV).contains(".java");
        Files.walk(path,2).filter(predicate).
                forEach(System.out::println);






    }
}
