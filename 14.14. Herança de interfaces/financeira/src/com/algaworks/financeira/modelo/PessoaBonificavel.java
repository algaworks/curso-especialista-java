package com.algaworks.financeira.modelo;

public interface PessoaBonificavel extends ClienteFinanciavel {

    double calcularBonus(double percentualMetaAlcancada);

}
