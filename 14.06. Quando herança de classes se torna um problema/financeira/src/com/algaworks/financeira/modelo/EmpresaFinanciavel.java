package com.algaworks.financeira.modelo;

public abstract class EmpresaFinanciavel extends Empresa {

    public EmpresaFinanciavel(String razaoSocial, double totalFaturamento) {
        super(razaoSocial, totalFaturamento);
    }

    public abstract double calcularLimiteAprovado();

}
