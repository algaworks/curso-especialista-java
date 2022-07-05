package com.algaworks.locacao;

public class GrupoVeiculo {

    private String nome;
    private double valorDiaria;

    public GrupoVeiculo() {
    }

    public GrupoVeiculo(String nome, double valorDiaria) {
        this.nome = nome;
        this.valorDiaria = valorDiaria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

}
