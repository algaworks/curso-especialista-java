package com.algaworks.banco;

import java.util.Objects;

public class ContaCorrente {

    private String numero;
    private double saldo;
    private boolean ativa;

    public ContaCorrente(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public boolean isInativa() {
        return !isAtiva();
    }

    public void ativar() {
        this.ativa = true;
    }

    public void inativar() {
        this.ativa = false;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de saque deve ser maior que 0");
        }

        if (valor > this.saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para saque");
        }

        if (isInativa()) {
            throw new ContaInativaException("Não pode sacar em conta inativa");
        }

        this.saldo -= valor;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de depósito deve ser maior que 0");
        }

        if (isInativa()) {
            throw new ContaInativaException("Não pode depositar em conta inativa");
        }

        this.saldo += valor;
    }

    public void transferir(ContaCorrente contaDestino, double valor) {
        Objects.requireNonNull(contaDestino);

        if (contaDestino.isInativa()) {
            throw new ContaInativaException("Conta de destino está inativa");
        }

        sacar(valor);
        contaDestino.depositar(valor);
    }

}
