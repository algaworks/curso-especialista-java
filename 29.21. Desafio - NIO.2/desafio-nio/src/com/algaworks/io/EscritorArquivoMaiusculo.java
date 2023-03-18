package com.algaworks.io;

import java.io.*;
import java.util.Objects;

public class EscritorArquivoMaiusculo {

    private final File arquivoOrigem;
    private final File arquivoDestino;

    public EscritorArquivoMaiusculo(File arquivoOrigem, File arquivoDestino) {
        Objects.requireNonNull(arquivoOrigem);
        Objects.requireNonNull(arquivoDestino);
        this.arquivoOrigem = arquivoOrigem;
        this.arquivoDestino = arquivoDestino;
    }

    public void processar() throws IOException {
        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivoOrigem));
             BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivoDestino))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                escritor.write(linha.toUpperCase());
                escritor.newLine();
            }
        }
    }

}
