package com.algaworks.io;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.nio.file.StandardOpenOption.*;

public class UnificadorDeArquivos {

    private final Path pastaArquivosFragmentados;
    private final Path arquivoUnificado;
    private final String prefixoArquivosFragmentados;

    public UnificadorDeArquivos(Path pastaArquivosFragmentados, Path arquivoUnificado,
                                String prefixoArquivosFragmentados) {
        Objects.requireNonNull(pastaArquivosFragmentados);
        Objects.requireNonNull(arquivoUnificado);
        Objects.requireNonNull(prefixoArquivosFragmentados);
        this.pastaArquivosFragmentados = pastaArquivosFragmentados;
        this.arquivoUnificado = arquivoUnificado;
        this.prefixoArquivosFragmentados = prefixoArquivosFragmentados;
    }

    public void unificar() throws IOException {
        List<Path> arquivosFragmentados = listarArquivosFragmentados();
        ordenarArquivosFragmentados(arquivosFragmentados);
        escreverArquivoUnificado(arquivoUnificado, arquivosFragmentados);
    }

    private List<Path> listarArquivosFragmentados() throws IOException {
        try (Stream<Path> stream = Files.list(pastaArquivosFragmentados)) {
            List<Path> arquivos = stream.filter(path -> path.getFileName().toString()
                            .startsWith(prefixoArquivosFragmentados + "."))
                    .collect(Collectors.toList());

            if (arquivos.isEmpty()) {
                throw new IOException("Não existem fragmentos com prefixo "
                        + prefixoArquivosFragmentados + " na pasta " + pastaArquivosFragmentados.toAbsolutePath());
            }
            return arquivos;
        }
    }

    private void ordenarArquivosFragmentados(List<Path> arquivos) {
        Pattern padraoNumeroArquivoFragmentado = Pattern.compile("\\.(\\d+)");

        arquivos.sort(Comparator.comparing(arquivo -> {
            Matcher matcher = padraoNumeroArquivoFragmentado.matcher(arquivo.getFileName().toString());
            if (matcher.find()) {
                return Integer.parseInt(matcher.group(1));
            }
            throw new RuntimeException("Erro ordenando arquivos fragmentados");
        }));
    }

    private void escreverArquivoUnificado(Path arquivoUnificado, List<Path> arquivosFragmentados) throws IOException {
        try (var canalEscrita = Files.newByteChannel(arquivoUnificado, CREATE_NEW, WRITE)) {
            for (Path arquivoFragmentado : arquivosFragmentados) {
                escreverFragmento(canalEscrita, arquivoFragmentado);
            }
        }
    }

    private void escreverFragmento(ByteChannel canalEscrita, Path arquivoFragmentado) throws IOException {
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        try (var canalLeitura = Files.newByteChannel(arquivoFragmentado, READ)) {
            while (canalLeitura.read(buffer) > 0) {
                buffer.flip();
                canalEscrita.write(buffer);
                buffer.clear();
            }
        }
    }

}