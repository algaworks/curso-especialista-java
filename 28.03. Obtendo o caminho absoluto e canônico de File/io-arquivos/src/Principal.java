import java.io.File;
import java.io.IOException;

public class Principal {

    public static void main(String[] args) throws IOException {
        File arquivo1 = new File("/Users/thiago/algaworks/ej/io-arquivos/docs/contrato.txt");
        System.out.println(arquivo1);
        System.out.println();

        File arquivo2 = new File("docs/contrato.txt");
        System.out.println(arquivo2);
        System.out.println(arquivo2.getAbsoluteFile());
        System.out.println();

        File arquivo3 = new File("../docs/contrato.txt");
        System.out.println(arquivo3);
        System.out.println(arquivo3.getAbsoluteFile());
        System.out.println(arquivo3.getCanonicalFile());

    }

}
