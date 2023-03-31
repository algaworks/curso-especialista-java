package com.algaworks.arquivos;

import com.algaworks.arquivos.fragmentador.FragmentadorDeArquivo;

import java.nio.file.Path;

public class Principal {

    public static void main(String[] args) {
        try {
            System.out.println("INFO: Iniciando programa de fragmentação...");
            var fragmentador = new FragmentadorDeArquivo(
                    Path.of("fotos/picanha.jpg"),
                    1024 * 50);
            fragmentador.fragmentar();
            System.out.println("INFO: Fragmentação concluída com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro fragmentando arquivo");
            e.printStackTrace();
        }
    }

}
