import com.algaworks.io.UnificadorDeArquivos;

import java.io.IOException;
import java.nio.file.Path;

public class Principal2 {

    public static void main(String[] args) {
        try {
            var unificador = new UnificadorDeArquivos(
                    Path.of("arquivos/fotos"),
                    Path.of("arquivos/fotos/picanha-unificado.jpg"),
                    "picanha.jpg");
            unificador.unificar();
        } catch (IOException e) {
            System.out.println("Erro ao unificar arquivos");
            e.printStackTrace();
        }
    }

}
