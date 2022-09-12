package com.algaworks.estoque;

public class ProdutoSemEstoqueException extends RuntimeException {

    public ProdutoSemEstoqueException(String message) {
        super(message);
    }

}
