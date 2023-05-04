package com.algaworks.csv;

import com.algaworks.crm.entidade.Cliente;

import java.util.List;

public class GeradorCSV {

    public static <T> void imprimir(List<Cliente> objetos) {
        System.out.println("codigo;nome;dataNascimento");
        objetos.forEach(GeradorCSV::imprimir);
    }

    private static void imprimir(Cliente cliente) {
        System.out.printf("%d;%s;%s%n", cliente.getCodigo(),
                cliente.getNome(), cliente.getDataNascimento());
    }

}