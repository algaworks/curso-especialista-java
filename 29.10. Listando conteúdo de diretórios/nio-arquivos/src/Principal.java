import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Principal {

    public static void main(String[] args) throws IOException {
        Path pasta = Path.of("docs");

        try (var stream = Files.list(pasta)) {
            stream.filter(Files::isRegularFile)
                    .map(Path::getFileName)
                    .map(Path::toString)
                    .filter(nome -> nome.matches(".*\\.txt"))
                    .forEach(System.out::println);
        }

    }

}
