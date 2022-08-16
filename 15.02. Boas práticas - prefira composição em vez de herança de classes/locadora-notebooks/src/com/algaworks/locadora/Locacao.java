package com.algaworks.locadora;

import java.util.Objects;

public class Locacao {

    private Notebook notebook;
    private Precificacao precificacao;
    private Seguro seguro;

    public Locacao(Notebook notebook, Precificacao precificacao) {
        Objects.requireNonNull(notebook);
        Objects.requireNonNull(precificacao);

        this.notebook = notebook;
        this.precificacao = precificacao;
    }

    public Locacao(Notebook notebook, Precificacao precificacao, Seguro seguro) {
        this(notebook, precificacao);
        this.seguro = seguro;
    }

    public Notebook getNotebook() {
        return notebook;
    }

    public Precificacao getPrecificacao() {
        return precificacao;
    }

    public Seguro getSeguro() {
        return seguro;
    }

    public boolean temSeguro() {
        return getSeguro() != null;
    }

    public double calcularValorDevido(int horasUtilizadas) {
        double valorTotal = getPrecificacao()
                .calcularValorTotal(getNotebook(), horasUtilizadas);

        if (temSeguro()) {
            valorTotal += getSeguro().calcularPremio(horasUtilizadas, valorTotal);
        }

        return valorTotal;
    }

}