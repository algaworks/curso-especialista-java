package com.algaworks.estoque;

import java.util.Objects;

public class Produto {

    private String nome;
    private int quantidadeEstoque;
    private boolean ativo;

    public Produto(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Objects.requireNonNull(nome, "Nome deve ser informado");
        this.nome = nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public boolean isInativo() {
        return !isAtivo();
    }

    public void ativar() {
        this.ativo = true;
    }

    public void desativar() {
        this.ativo = false;
    }

    public void retirarEstoque(int quantidade)
            throws ProdutoSemEstoqueException, ProdutoInativoException {
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade não pode ser negativa para retirada no estoque");
        }

        if (isInativo()) {
            throw new ProdutoInativoException("Retirada no estoque não pode ser realizada em produto inativo");
        }

        if (this.quantidadeEstoque - quantidade < 0) {
            throw new ProdutoSemEstoqueException("Estoque insuficiente", this.quantidadeEstoque, quantidade);
        }

        this.quantidadeEstoque -= quantidade;
    }

    public void adicionarEstoque(int quantidade) {
        this.quantidadeEstoque += quantidade;
    }

}