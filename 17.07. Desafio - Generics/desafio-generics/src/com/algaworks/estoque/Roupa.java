package com.algaworks.estoque;

public class Roupa implements Estocavel {

    private String descricao;
    private int quantidadeEstoque;

    public Roupa(String descricao, int quantidadeEstoque) {
        this.descricao = descricao;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

}
