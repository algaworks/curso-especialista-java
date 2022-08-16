package com.algabank;

import com.javabank.ContaCorrente;

public class Principal {

    public static void main(String[] args) {
        AuditoriaDecorator conta1 = new AuditoriaDecorator(new ContaCorrente());

        conta1.depositar(1000);
        conta1.sacar(100);
        conta1.sacar(50);
        conta1.imprimirSaldo();

        System.out.printf("Saldo da conta: R$%.2f%n", conta1.getSaldo());
        System.out.printf("Operações: %d", conta1.getQuantidadeOperacoes());
    }

}