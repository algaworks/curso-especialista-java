import java.nio.file.Path;

public class Principal2 {

    public static void main(String[] args) {
        Path pasta = Path.of("docs");
        Path arquivo = Path.of("contrato.txt");
        Path arquivoResolvido = pasta.resolve(arquivo);

        System.out.println(arquivoResolvido.toAbsolutePath());
    }

}
