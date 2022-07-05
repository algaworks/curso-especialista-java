package com.algaworks.cartaobeneficio;

public class Cartao {

    public static final double TARIFA_DEPOSITO = 0.10;
    public static final double VALOR_MINIMO_DEPOSITO = 50;

    public String titular;
    public double saldo;

    public Cartao(String titular) {
        this.titular = titular;
    }

}
