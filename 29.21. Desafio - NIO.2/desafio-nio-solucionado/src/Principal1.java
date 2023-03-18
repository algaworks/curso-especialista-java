import com.algaworks.io.FragmentadorDeArquivo;

import java.io.IOException;
import java.nio.file.Path;

public class Principal1 {

    public static void main(String[] args) {
        try {
            var fragmentador = new FragmentadorDeArquivo(
                    Path.of("arquivos/fotos/picanha.jpg"),
                    1024 * 50);
            fragmentador.fragmentar();
        } catch (IOException e) {
            System.out.println("Erro fragmentando arquivo");
            e.printStackTrace();
        }
    }

}
