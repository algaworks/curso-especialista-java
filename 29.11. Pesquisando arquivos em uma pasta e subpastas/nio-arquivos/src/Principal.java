import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Principal {

    public static void main(String[] args) throws IOException {
        Path pasta = Path.of("docs");

        try (var stream = Files.find(pasta, Integer.MAX_VALUE,
                (path, attrs) -> path.getFileName().toString()
                        .matches(".*\\.txt"))) {
            stream.forEach(System.out::println);
        }

    }

}
