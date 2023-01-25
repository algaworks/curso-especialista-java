package com.algaworks.estoque;

public class ServicoInativacaoProduto {

    public void processar(Produto produto) {
        System.out.println("Inativando " + produto.getNome());
        produto.inativar();
    }

}