package com.algaworks.locadora;

public class LocacaoPorHoraSeguroItau extends LocacaoPorHora {

    public LocacaoPorHoraSeguroItau(Notebook notebook) {
        super(notebook);
    }

    @Override
    public double calcularValorDevido(int horasUtilizadas) {
        double valorTotal = super.calcularValorDevido(horasUtilizadas);

        double dias = Math.ceil(horasUtilizadas / 24d);
        valorTotal += dias * 5;

        return valorTotal;
    }

}
