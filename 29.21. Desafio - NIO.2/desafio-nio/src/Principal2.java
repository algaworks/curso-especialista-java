import com.algaworks.io.UnificadorDeArquivos;

import java.io.File;
import java.io.IOException;

public class Principal2 {

    public static void main(String[] args) {
        try {
            var unificador = new UnificadorDeArquivos(
                    new File("arquivos/fotos"),
                    new File("arquivos/fotos/picanha-unificado.jpg"),
                    "picanha.jpg");
            unificador.unificar();
        } catch (IOException e) {
            System.out.println("Erro ao unificar arquivos");
            e.printStackTrace();
        }
    }

}
