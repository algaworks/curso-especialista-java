package com.algaworks.banco;

public final class ContaEspecial extends ContaInvestimento {

    private double tarifaMensal;
    private double limiteChequeEspecial;

    public ContaEspecial(Titular titular, int agencia, int numero, double tarifaMensal) {
        super(titular, agencia, numero);
        this.tarifaMensal = tarifaMensal;
    }

    public double getTarifaMensal() {
        return tarifaMensal;
    }

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getSaldoDisponivel() {
        return getSaldo() + getLimiteChequeEspecial();
    }

    @Override
    public final void imprimirDemonstrativo() {
        super.imprimirDemonstrativo();
        System.out.printf("Saldo disponível: %.2f%n", getSaldoDisponivel());
    }

    @Override
    protected final void validarSaldoParaSaque(double valorSaque) {
        if (getSaldoDisponivel() < valorSaque) {
            throw new RuntimeException("Saldo insuficiente para saque");
        }
    }

    public void debitarTarifaMensal() {
        sacar(getTarifaMensal());
    }

    @Override
    public String toString() {
        return "ContaEspecial{" +
                "titular=" + getTitular() +
                ", agencia=" + getAgencia() +
                ", numero=" + getNumero() +
                ", valorTotalRendimentos=" + getValorTotalRendimentos() +
                ", tarifaMensal=" + tarifaMensal +
                ", limiteChequeEspecial=" + limiteChequeEspecial +
                '}';
    }

}