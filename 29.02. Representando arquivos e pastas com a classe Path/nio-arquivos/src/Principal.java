import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Principal {

    public static void main(String[] args) {
//        FileSystem fs = FileSystems.getDefault();
//        Path arquivo1 = fs.getPath("/Users/thiago/algaworks/ej/nio-arquivos/docs/contrato.txt");
//        Path arquivo1 = fs.getPath("/Users/thiago/algaworks/ej/nio-arquivos", "docs", "contrato.txt");
        Path arquivo1 = Path.of("/Users/thiago/algaworks/ej/nio-arquivos", "docs", "contrato.txt");

        Path nomeArquivo = arquivo1.getFileName();
        Path pasta = arquivo1.getParent();

        System.out.println(arquivo1);
        System.out.println(nomeArquivo);
        System.out.println(pasta);

        File arquivo2 = arquivo1.toFile();
        Path arquivo3 = arquivo2.toPath();
    }

}
