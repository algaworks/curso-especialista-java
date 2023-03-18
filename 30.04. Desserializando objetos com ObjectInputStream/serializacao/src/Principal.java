import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.READ;

public class Principal {

    public static void main(String[] args) {
        Path path = Path.of("objetos/joao.ser");

        try (var inputStream = new ObjectInputStream(Files.newInputStream(path, READ))) {
            Funcionario funcionario = (Funcionario) inputStream.readObject();
            System.out.println(funcionario);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
