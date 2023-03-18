import java.nio.file.Path;

public class Principal1 {

    public static void main(String[] args) {
//        Path arquivo = Path.of("/Users/thiago/algaworks/ej/nio-arquivos/docs/contrato.txt");
        Path arquivo = Path.of("../contrato.txt");
        Path arquivoAbsoluto = arquivo.toAbsolutePath();
        Path arquivoNormalizado = arquivoAbsoluto.normalize();

        System.out.println(arquivo);
        System.out.println(arquivoAbsoluto);

        System.out.println(arquivo.isAbsolute());
        System.out.println(arquivoAbsoluto.isAbsolute());
        System.out.println(arquivoNormalizado);
    }

}
