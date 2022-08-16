package com.algaworks.financeira.modelo;

public interface ClienteFinanciavel {

    double calcularLimiteAprovado();

    default double calcularJuros(double valorSolicitado) {
        if (isFinanciamentoPequenoValor(valorSolicitado)) {
            return 1.0;
        } else if (isFinanciamentoGrandeValor(valorSolicitado)) {
            return 1.5;
        }

        return 2.0;
    }

    static boolean isFinanciamentoGrandeValor(double valorSolicitado) {
        return valorSolicitado <= 1_000_000;
    }

    static boolean isFinanciamentoPequenoValor(double valorSolicitado) {
        return valorSolicitado <= 100_000;
    }

}
