package com.algaworks.csv;

import com.algaworks.crm.entidade.Cliente;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GeradorCSV {

    public static <T> void imprimir(List<Cliente> objetos) {
        Field[] propriedades = Cliente.class.getDeclaredFields();

        System.out.println(Arrays.stream(propriedades)
                .map(Field::getName)
                .collect(Collectors.joining(";")));

        objetos.forEach(GeradorCSV::imprimir);
    }

    private static void imprimir(Cliente cliente) {
        System.out.printf("%d;%s;%s%n", cliente.getCodigo(),
                cliente.getNome(), cliente.getDataNascimento());
    }

}