import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Principal {

    public static void main(String[] args) {
        try {
            Path arquivo = Path.of("/Users/thiago/Desktop/abc/teste.txt");
            Files.createFile(arquivo);
        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo: " + e.getMessage());
            e.printStackTrace();
        }
    }

}