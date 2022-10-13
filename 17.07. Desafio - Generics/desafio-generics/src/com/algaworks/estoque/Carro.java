package com.algaworks.estoque;

public class Carro implements Estocavel {

    private String modelo;
    private int quantidadeEstoque;

    public Carro(String modelo, int quantidadeEstoque) {
        this.modelo = modelo;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

}
