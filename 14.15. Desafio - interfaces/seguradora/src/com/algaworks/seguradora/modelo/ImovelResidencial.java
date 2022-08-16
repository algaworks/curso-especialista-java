package com.algaworks.seguradora.modelo;

public class ImovelResidencial implements BemSeguravel {

    private double valorMercado;
    private int areaConstruida;

    public ImovelResidencial(double valorMercado, int areaConstruida) {
        this.valorMercado = valorMercado;
        this.areaConstruida = areaConstruida;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }

    public int getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(int areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    @Override
    public double calcularValorPremio() {
        double valorPremio = getValorMercado() * 0.001;
        valorPremio += getAreaConstruida() * 0.3;

        return valorPremio;
    }

    @Override
    public String descrever() {
        return String.format("Imóvel residencial com %dm2 de área construída, avaliado em R$%.2f",
                getAreaConstruida(), getValorMercado());
    }

}
