package com.algaworks.financeira.modelo;

public class LojaVarejista extends EmpresaFinanciavel {

    public static final double PERCENTUAL_FATURAMENTO_LIMITE_CREDITO = 0.2;
    public static final double PERCENTUAL_VALOR_ESTOQUE_LIMITE_CREDITO = 0.5;

    private double valorTotalEstoque;

    public LojaVarejista(String razaoSocial, double totalFaturamento, double valorTotalEstoque) {
        super(razaoSocial, totalFaturamento);
        this.valorTotalEstoque = valorTotalEstoque;
    }

    public double getValorTotalEstoque() {
        return valorTotalEstoque;
    }

    public void setValorTotalEstoque(double valorTotalEstoque) {
        this.valorTotalEstoque = valorTotalEstoque;
    }

    @Override
    public double calcularLimiteAprovado() {
        return (getTotalFaturamento() * PERCENTUAL_FATURAMENTO_LIMITE_CREDITO) 
            + (getValorTotalEstoque() * PERCENTUAL_VALOR_ESTOQUE_LIMITE_CREDITO);
    }

}