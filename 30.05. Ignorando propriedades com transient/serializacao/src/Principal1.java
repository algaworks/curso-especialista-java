import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.Month;

import static java.nio.file.StandardOpenOption.*;

public class Principal1 {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João",
                LocalDate.of(2005, Month.MARCH, 2),
                new BigDecimal("25000"));

        Path path = Path.of("objetos/joao.ser");

        try (var outputStream = new ObjectOutputStream(
                Files.newOutputStream(path, WRITE, CREATE))) {
            outputStream.writeObject(funcionario);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
