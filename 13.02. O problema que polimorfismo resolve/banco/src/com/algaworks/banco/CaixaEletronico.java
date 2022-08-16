package com.algaworks.banco;

public class CaixaEletronico {

    public static final double TARIFA_TRANSFERENCIA = 10;

    public void transferir(ContaEspecial contaOrigem, ContaEspecial contaDestino,
                           double valorTransferencia) {
        System.out.printf("Transferindo R$%.2f da conta %d/%d para %d/%d%n",
                valorTransferencia, contaOrigem.getAgencia(), contaOrigem.getNumero(),
                contaDestino.getAgencia(), contaDestino.getNumero());

        contaOrigem.sacar(valorTransferencia + TARIFA_TRANSFERENCIA);
        contaDestino.depositar(valorTransferencia);
    }

    public void transferir(ContaEspecial contaOrigem, ContaSalario contaDestino,
                           double valorTransferencia) {
        System.out.printf("Transferindo R$%.2f da conta %d/%d para %d/%d%n",
                valorTransferencia, contaOrigem.getAgencia(), contaOrigem.getNumero(),
                contaDestino.getAgencia(), contaDestino.getNumero());

        contaOrigem.sacar(valorTransferencia + TARIFA_TRANSFERENCIA);
        contaDestino.depositar(valorTransferencia);
    }

}
