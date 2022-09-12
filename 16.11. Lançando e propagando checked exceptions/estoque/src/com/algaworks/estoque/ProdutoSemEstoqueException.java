package com.algaworks.estoque;

public class ProdutoSemEstoqueException extends Exception {

    private final int estoqueDisponivel;
    private final int estoqueNecessario;

    public ProdutoSemEstoqueException(String message, int estoqueDisponivel, int estoqueNecessario) {
        super(message);
        this.estoqueDisponivel = estoqueDisponivel;
        this.estoqueNecessario = estoqueNecessario;
    }

    public int getEstoqueDisponivel() {
        return estoqueDisponivel;
    }

    public int getEstoqueNecessario() {
        return estoqueNecessario;
    }

}
