package com.algaworks.banco;

import com.algaworks.banco.negocio.ContaCorrente;
import com.algaworks.banco.negocio.Titular;

import java.math.BigDecimal;
import java.util.logging.Logger;

public class Principal {

    private static final Logger logger = Logger.getLogger(Principal.class.getName());

    public static void main(String[] args) {
        var titular = new Titular("João", "12312312399");
        var contaCorrente = new ContaCorrente(titular, 100, 9999);

        logger.fine("Manipulando conta corrente...");
        contaCorrente.depositar(new BigDecimal("200"));
        contaCorrente.sacar(new BigDecimal("50.5"));
    }

}
