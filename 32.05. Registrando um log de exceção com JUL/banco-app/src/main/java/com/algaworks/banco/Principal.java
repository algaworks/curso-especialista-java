package com.algaworks.banco;

import com.algaworks.banco.negocio.ContaCorrente;
import com.algaworks.banco.negocio.SaldoInsuficienteException;
import com.algaworks.banco.negocio.Titular;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {

    private static final Logger logger = Logger.getLogger(Principal.class.getName());

    public static void main(String[] args) {
        var titular = new Titular("João", "12312312399");
        var contaCorrente = new ContaCorrente(titular, 100, 9999);

        try {
            logger.fine("Manipulando conta corrente...");
            contaCorrente.depositar(new BigDecimal("200"));
            contaCorrente.sacar(new BigDecimal("50.5"));
//            contaCorrente.sacar(new BigDecimal("300"));
            contaCorrente.sacar(new BigDecimal("-10"));
        } catch (SaldoInsuficienteException e) {
            logger.log(Level.WARNING, "Pedido de saque com saldo insuficiente para conta "
                    + contaCorrente.getAgencia() + "/" + contaCorrente.getNumero(), e);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Erro administrando conta corrente "
                + contaCorrente.getAgencia() + "/" + contaCorrente.getNumero(), e);
        }
    }

}
