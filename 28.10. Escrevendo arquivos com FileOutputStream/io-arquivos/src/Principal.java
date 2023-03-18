import java.io.*;

public class Principal {

    public static void main(String[] args) {
        File arquivoOrigem = new File("docs/foto1.jpg");
        File arquivoDestino = new File("docs/foto2.jpg");

        try (InputStream inputStream = new FileInputStream(arquivoOrigem);
            OutputStream outputStream = new FileOutputStream(arquivoDestino)) {
            byte[] conteudo = new byte[1024]; // 1kb
            int quantidadeBytes;

            while ((quantidadeBytes = inputStream.read(conteudo)) > 0) {
                outputStream.write(conteudo, 0, quantidadeBytes);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Arquivo não encontrado", e);
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }
    }

}
