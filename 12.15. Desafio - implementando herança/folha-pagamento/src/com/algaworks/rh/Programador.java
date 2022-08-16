package com.algaworks.rh;

public class Programador extends Funcionario {

    private double valorBonus;

    public Programador(String nome, double valorHora) {
        super(nome, valorHora);
    }

    public double getValorBonus() {
        return valorBonus;
    }

    public void setValorBonus(double valorBonus) {
        if (valorBonus < 0) {
            throw new IllegalArgumentException("Valor de bônus deve ser maior que 0");
        }

        this.valorBonus = valorBonus;
    }

    @Override
    protected final double calcularSalario(int horasTrabalhadas) {
        return super.calcularSalario(horasTrabalhadas) + valorBonus;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "nome='" + getNome() + '\'' +
                ", valorHora=" + getValorHora() +
                ", valorBonus=" + valorBonus +
                '}';
    }

}
