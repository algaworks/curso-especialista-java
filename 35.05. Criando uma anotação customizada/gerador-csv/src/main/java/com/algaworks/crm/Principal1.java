package com.algaworks.crm;

import com.algaworks.crm.entidade.Cliente;
import com.algaworks.csv.GeradorCSV;

import java.time.LocalDate;
import java.util.Arrays;

public class Principal1 {

    public static void main(String[] args) {
        var clientes = Arrays.asList(new Cliente(1L,"João", LocalDate.parse("2005-03-10")),
                new Cliente(2L,"Maria", LocalDate.parse("1981-09-13")),
                new Cliente(3L,"Manoel", LocalDate.parse("1986-11-30")),
                new Cliente(4L,"Ana", LocalDate.parse("1992-05-02")));

        GeradorCSV.imprimir(Cliente.class, clientes);
    }

}