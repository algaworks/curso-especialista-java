package com.algaworks.locadora;

public class SeguroSantander implements Seguro {

    @Override
    public double calcularPremio(int horasUtilizadas, double valorContrato) {
        return (horasUtilizadas * 0.50) + (valorContrato * 0.05);
    }

}
