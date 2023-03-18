import com.algaworks.io.EscritorArquivoMaiusculo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class Principal3 {

    public static void main(String[] args) {
        try {
            var escritor = new EscritorArquivoMaiusculo(
                    Path.of("arquivos/textos/poema1.txt"),
                    Path.of("arquivos/textos/poema2.txt"));

            escritor.processar();
        } catch (IOException e) {
            System.out.println("Erro processando e escrevendo novo arquivo");
            e.printStackTrace();
        }
    }

}
