package com.algaworks.banco;

import com.algaworks.banco.negocio.ContaCorrente;
import com.algaworks.banco.negocio.Titular;

import java.math.BigDecimal;

public class Principal {

    public static void main(String[] args) {
        var titular = new Titular("João", "12312312399");
        var contaCorrente = new ContaCorrente(titular, 100, 9999);

        contaCorrente.depositar(new BigDecimal("200"));
        contaCorrente.sacar(new BigDecimal("50.5"));
    }

}
