package com.algaworks.locadora;

public class LocacaoPorDia extends Locacao {

    public LocacaoPorDia(Notebook notebook) {
        super(notebook);
    }

    @Override
    public double calcularValorDevido(int horasUtilizadas) {
        double dias = Math.ceil(horasUtilizadas / 24d);
        return getNotebook().getPrecoPorDia() * dias;
    }

}