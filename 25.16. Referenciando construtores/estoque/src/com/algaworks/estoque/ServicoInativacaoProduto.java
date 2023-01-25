package com.algaworks.estoque;

public class ServicoInativacaoProduto {

    public static void processar(Produto produto) {
        System.out.println("Inativando " + produto.getNome());
        produto.inativar();
    }

}