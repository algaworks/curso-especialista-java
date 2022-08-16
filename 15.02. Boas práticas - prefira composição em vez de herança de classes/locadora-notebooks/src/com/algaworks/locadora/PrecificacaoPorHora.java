package com.algaworks.locadora;

public class PrecificacaoPorHora implements Precificacao {

    @Override
    public double calcularValorTotal(Notebook notebook, int horasUtilizadas) {
        return notebook.getPrecoPorHora() * horasUtilizadas;
    }

}
