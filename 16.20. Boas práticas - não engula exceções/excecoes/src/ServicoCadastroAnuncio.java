import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ServicoCadastroAnuncio {

    public void cadastrar(String codigo, String descricao) {
        Path arquivo = Path.of("/Users/thiago/Desktop/abc", codigo + ".txt");

        try {
            Files.writeString(arquivo, descricao);
        } catch (IOException e) {
            throw new CadastroAnuncioException("Erro na escrita do arquivo de anúncio", e);

            // É melhor usar alguma biblioteca de logging para fazer isso
//            System.out.println("Erro escrevendo arquivo. Ignorando...");
//            e.printStackTrace();
        }
    }

}