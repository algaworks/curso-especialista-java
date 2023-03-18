import java.io.File;
import java.io.IOException;

public class Principal {

    public static void main(String[] args) throws IOException {
        File pasta = new File("docs").getCanonicalFile();

//        File[] arquivos = pasta.listFiles();
//        File[] arquivos = pasta.listFiles(File::isFile);
//        File[] arquivos = pasta.listFiles(File::isDirectory);
        File[] arquivos = pasta.listFiles((dir, nome) -> nome.startsWith("c"));

        if (arquivos != null) {
            for (File arquivo : arquivos) {
                System.out.println(arquivo.getName());
            }
        }
    }

}
