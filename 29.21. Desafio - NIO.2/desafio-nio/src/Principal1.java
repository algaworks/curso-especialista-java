import com.algaworks.io.FragmentadorDeArquivo;

import java.io.File;
import java.io.IOException;

public class Principal1 {

    public static void main(String[] args) {
        try {
            var fragmentador = new FragmentadorDeArquivo(
                    new File("arquivos/fotos/picanha.jpg"),
                    1024 * 50);
            fragmentador.fragmentar();
        } catch (IOException e) {
            System.out.println("Erro fragmentando arquivo");
            e.printStackTrace();
        }
    }

}
