package com.algaworks.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

public class EscritorArquivoMaiusculo {

    private final Path arquivoOrigem;
    private final Path arquivoDestino;

    public EscritorArquivoMaiusculo(Path arquivoOrigem, Path arquivoDestino) {
        Objects.requireNonNull(arquivoOrigem);
        Objects.requireNonNull(arquivoDestino);
        this.arquivoOrigem = arquivoOrigem;
        this.arquivoDestino = arquivoDestino;
    }

    public void processar() throws IOException {
        try (BufferedReader leitor = Files.newBufferedReader(arquivoOrigem);
             BufferedWriter escritor = Files.newBufferedWriter(arquivoDestino)) {

            String linha;
            while ((linha = leitor.readLine()) != null) {
                escritor.write(linha.toUpperCase());
                escritor.newLine();
            }
        }
    }

}
