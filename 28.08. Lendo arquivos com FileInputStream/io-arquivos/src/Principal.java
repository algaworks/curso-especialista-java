import java.io.*;

public class Principal {

    public static void main(String[] args) {
        File arquivoOrigem = new File("docs/contrato.txt");
        InputStream inputStream = null;

        try {
            inputStream = new FileInputStream(arquivoOrigem);
            int conteudo;

            while ((conteudo = inputStream.read()) != -1) {
                System.out.print((char) conteudo);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Arquivo não encontrado", e);
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    System.out.println("Não foi possível fechar fluxo com arquivo");
                }
            }
        }
    }

}
