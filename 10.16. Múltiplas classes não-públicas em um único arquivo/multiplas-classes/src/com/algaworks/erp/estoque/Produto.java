package com.algaworks.erp.estoque;

import java.util.Objects;
import java.util.UUID;

public class Produto {

    static final int QUANTIDADE_ESTOQUE_INICIAL = 100;

    private final String codigo;
    private String nome;
    private int quantidadeEstoque;
    private Fornecedor fornecedor;
    private Categoria categoria;

    public Produto() {
        this("Sem nome");
    }

    public Produto(String nome) {
        this(nome, QUANTIDADE_ESTOQUE_INICIAL);
    }

    private Produto(String nome, int estoqueInicial) {
        Objects.requireNonNull(nome, "Nome é obrigatório");

        if (estoqueInicial < 0) {
            throw new IllegalArgumentException("Estoque inicial não pode ser negativo");
        }

        this.nome = nome;
        this.quantidadeEstoque = estoqueInicial;
        this.codigo = gerarCodigo();
    }

    private String gerarCodigo() {
        return UUID.randomUUID().toString();
    }

    public void imprimir() {
        System.out.printf("%s x %d itens", nome, quantidadeEstoque);
    }

}

class Fornecedor {
}

class Categoria {
}

class Principal {

    public static void main(String[] args) {
        Produto produto = new Produto("Suco de uva");
        produto.imprimir();
    }

}