import java.io.File;
import java.io.IOException;

public class Principal {

    public static void main(String[] args) throws IOException {
//        File pasta1 = new File("C:\\temp\\docs");
        File pasta1 = new File("/Users/thiago/algaworks/ej/io-arquivos/docs");
        System.out.printf("Pasta 1 criada: %b%n", pasta1.mkdir());

        File pasta2 = new File("/Users/thiago/algaworks/ej/io-arquivos/fotos/viagens");
        System.out.printf("Pasta 2 criada: %b%n", pasta2.mkdirs());

        File arquivo1 = new File("C:\\temp\\contrato.txt");
        File arquivo2 = new File("/Users/thiago/algaworks/ej/io-arquivos/docs/contrato.txt");
        File arquivo3 = new File("/Users/thiago/algaworks/ej/io-arquivos", "docs/contrato.txt");
        File arquivo4 = new File(pasta1, "contrato.txt");

        System.out.printf("Arquivo 4 criado: %b%n", arquivo4.createNewFile());
    }

}
