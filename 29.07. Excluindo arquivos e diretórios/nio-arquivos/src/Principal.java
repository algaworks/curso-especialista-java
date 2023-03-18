import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Principal {

    public static void main(String[] args) throws IOException {
        Path arquivoContrato = Path.of("docs/contratos/fornecedores/contrato-venda.txt");
        Files.delete(arquivoContrato);
//        Files.deleteIfExists(arquivoContrato);

        Path pastaFornecedores = Path.of("docs/contratos/fornecedores");
        Files.delete(pastaFornecedores);

//        Path pastaClientes = Path.of("docs/contratos/clientes");
//        Files.delete(pastaClientes);
    }

}
