package com.algaworks.impostos;

public abstract class PessoaJuridica extends Pessoa {

    private double faturamentoAnual;
    private double despesaAnual;

    public PessoaJuridica(String nome, double faturamentoAnual, double despesaAnual) {
        super(nome);
        this.faturamentoAnual = faturamentoAnual;
        this.despesaAnual = despesaAnual;
    }

    public double getFaturamentoAnual() {
        return faturamentoAnual;
    }

    public double getDespesaAnual() {
        return despesaAnual;
    }

    public double getLucroAnual() {
        return getFaturamentoAnual() - getDespesaAnual();
    }

}
