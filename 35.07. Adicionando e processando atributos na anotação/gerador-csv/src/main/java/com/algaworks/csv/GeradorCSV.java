package com.algaworks.csv;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GeradorCSV {

    public static <T> void imprimir(Class<T> clazz, List<T> objetos) {
        Field[] propriedades = clazz.getDeclaredFields();

        System.out.println(Arrays.stream(propriedades)
                .filter(propriedade -> propriedade.isAnnotationPresent(Campo.class))
                .map(Field::getName)
                .collect(Collectors.joining(";")));

        objetos.forEach(GeradorCSV::imprimir);
    }

    private static void imprimir(Object cliente) {
        Field[] propriedades = cliente.getClass().getDeclaredFields();
        List<String> valores = new ArrayList<>();

        try {
            for (Field propriedade : propriedades) {
                if (propriedade.isAnnotationPresent(Campo.class)) {
                    Campo anotacaoCampo = propriedade.getAnnotation(Campo.class);
                    propriedade.setAccessible(true);
                    Object resultado = propriedade.get(cliente);
                    String resultadoString = resultado == null ? "" : resultado.toString();
                    valores.add(anotacaoCampo.maiusculo() ? resultadoString.toUpperCase() : resultadoString);
                }
            }

            System.out.println(String.join(";", valores));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

}