package com.algaworks.banco;

public class ContaInvestimento extends Conta {

    private double valorTotalRendimentos;

    public ContaInvestimento(Titular titular, int agencia, int numero) {
        super(titular, agencia, numero);
    }

    public double getValorTotalRendimentos() {
        return valorTotalRendimentos;
    }

    @Override
    public boolean possuiGratuidadeImpressao() {
        return getValorTotalRendimentos() > 0;
    }

    public void creditarRendimentos(double percentualJuros) {
        double valorRendimentos = getSaldo() * percentualJuros / 100;
        this.valorTotalRendimentos += valorRendimentos;
        depositar(valorRendimentos);
    }

    @Override
    public String toString() {
        return "ContaInvestimento{" +
                "titular=" + getTitular() +
                ", agencia=" + getAgencia() +
                ", numero=" + getNumero() +
                ", valorTotalRendimentos=" + valorTotalRendimentos +
                '}';
    }

}