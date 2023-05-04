package com.algaworks.crm;

import com.algaworks.crm.entidade.Produto;
import com.algaworks.csv.GeradorCSV;

import java.math.BigDecimal;
import java.util.Arrays;

public class Principal2 {

    public static void main(String[] args) {
        var produtos = Arrays.asList(new Produto(1L, "Macbook Pro", new BigDecimal("19500"), 25),
                new Produto(2L, "iPhone", new BigDecimal("12300"), 7),
                new Produto(4L, "Monitor", new BigDecimal("1800"), 18));

        GeradorCSV.imprimir(Produto.class, produtos);
    }

}