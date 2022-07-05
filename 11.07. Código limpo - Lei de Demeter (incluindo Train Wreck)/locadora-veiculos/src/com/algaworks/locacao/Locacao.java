package com.algaworks.locacao;

public class Locacao {

    private Veiculo veiculo;
    private int quantidadeDiarias;

    public Locacao() {
    }

    public Locacao(Veiculo veiculo, int quantidadeDiarias) {
        this.veiculo = veiculo;
        this.quantidadeDiarias = quantidadeDiarias;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public int getQuantidadeDiarias() {
        return quantidadeDiarias;
    }

    public void setQuantidadeDiarias(int quantidadeDiarias) {
        this.quantidadeDiarias = quantidadeDiarias;
    }

    public double getValorDiaria() {
        return veiculo.getValorDiaria();
    }

    public double calcularTotalDiarias() {
        return getValorDiaria() * quantidadeDiarias;
    }

    public void reservarVeiculo() {
        veiculo.setDisponivel(false);
    }

}
