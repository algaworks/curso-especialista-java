import java.io.*;

public class Principal {

    public static void main(String[] args) {
        String[] nomes = { "João", "Maria", "Sebastião", "José" };
        File arquivoDestino = new File("docs/lista.txt");

        try (Writer escritor = new FileWriter(arquivoDestino)) {
            for (String nome : nomes) {
                escritor.write(nome + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }
    }

}
