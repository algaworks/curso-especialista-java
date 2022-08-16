package com.algaworks.rh;

public record Holerite(String nomeFuncionario, String mesAno, double valorSalario) {

    public void imprimir() {
        System.out.println();
        System.out.printf("Holerite de %s%n", nomeFuncionario());
        System.out.printf("Mês/ano: %s%n", mesAno());
        System.out.printf("Salário a receber: %.2f%n", valorSalario());
    }

}
