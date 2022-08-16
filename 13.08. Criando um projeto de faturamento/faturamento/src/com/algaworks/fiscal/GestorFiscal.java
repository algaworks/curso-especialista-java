package com.algaworks.fiscal;

public class GestorFiscal {

    public void emitirNotasFiscais(NotaFiscal... notasFiscais) {
        for (NotaFiscal notaFiscal : notasFiscais) {
            notaFiscal.emitir();
            System.out.println("---------------");
        }
    }

}
