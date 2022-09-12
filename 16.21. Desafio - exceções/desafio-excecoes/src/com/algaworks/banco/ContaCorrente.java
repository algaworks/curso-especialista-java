package com.algaworks.banco;

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

    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque deve ser maior que 0");
            return false;
        }

        if (valor > this.saldo) {
            System.out.println("Conta sem saldo");
            return false;
        }

        if (isInativa()) {
            System.out.println("Conta inativa");
            return false;
        }

        this.saldo -= valor;
        return true;
    }

    public boolean depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito deve ser maior que 0");
            return false;
        }

        if (isInativa()) {
            System.out.println("Conta inativa");
            return false;
        }

        this.saldo += valor;
        return true;
    }

    public boolean transferir(ContaCorrente contaDestino, double valor) {
        if (contaDestino.isInativa()) {
            System.out.println("Conta de destino está inativa");
            return false;
        }

        if (sacar(valor)) {
            contaDestino.depositar(valor);
            return true;
        }

        return false;
    }

}
