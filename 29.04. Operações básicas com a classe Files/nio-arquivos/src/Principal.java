import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Principal {

    public static void main(String[] args) throws IOException {
        Path pastaDocs = Path.of("docs");
        Files.createDirectory(pastaDocs);

        Path pastaFornecedores = Path.of("docs/contratos/fornecedores");
        Files.createDirectories(pastaFornecedores);

        Path arquivoContrato = pastaFornecedores.resolve(Path.of("contrato-venda.txt"));
        Files.createFile(arquivoContrato);
        System.out.println(Files.exists(arquivoContrato));
    }

}
