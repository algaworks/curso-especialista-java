package com.algaworks.seguradora.modelo;

public class Caminhao extends VeiculoAutomotor {

    private int quantidadeEixos;

    public Caminhao(String modelo, int anoFabricacao, double valorMercado, int quantidadeEixos) {
        super(modelo, anoFabricacao, valorMercado);
        this.quantidadeEixos = quantidadeEixos;
    }

    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }

    public void setQuantidadeEixos(int quantidadeEixos) {
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public double calcularValorPremio() {
        double valorPremio = getValorMercado() * 0.02;

        valorPremio += getQuantidadeEixos() * 50;

        return valorPremio;
    }

    @Override
    public String descrever() {
        return String.format("Caminhão %s ano %d, %d eixos, avaliado em R$%.2f",
                getModelo(), getAnoFabricacao(), getQuantidadeEixos(), getValorMercado());
    }

}
