package com.algaworks.io;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

import static java.nio.file.StandardOpenOption.*;

public class FragmentadorDeArquivo {

    private final Path arquivo;
    private final int tamanhoFragmento;

    public FragmentadorDeArquivo(Path arquivo, int tamanhoFragmento) {
        Objects.requireNonNull(arquivo);
        if (tamanhoFragmento < 1) {
            throw new IllegalArgumentException("Tamanho do fragmento deve ser a partir de 1 byte");
        }

        this.arquivo = arquivo;
        this.tamanhoFragmento = tamanhoFragmento;
    }

    public void fragmentar() throws IOException {
        ByteBuffer buffer = ByteBuffer.allocate(tamanhoFragmento);
        try (var canalLeitura = Files.newByteChannel(arquivo, READ)) {
            int numeroFragmento = 1;

            while (canalLeitura.read(buffer) > 0) {
                buffer.flip();
                Path arquivoFragmento = criarArquivoFragmento(numeroFragmento++);
                escreverFragmento(arquivoFragmento, buffer);
                buffer.clear();
            }
        }
    }

    private Path criarArquivoFragmento(int numeroFragmento) {
        return Path.of(arquivo.toAbsolutePath().toString() + "." + numeroFragmento);
    }

    private void escreverFragmento(Path arquivoFragmento, ByteBuffer buffer) throws IOException {
        try (var canalEscrita = Files.newByteChannel(arquivoFragmento, CREATE_NEW, WRITE)) {
            canalEscrita.write(buffer);
        }
    }

}
