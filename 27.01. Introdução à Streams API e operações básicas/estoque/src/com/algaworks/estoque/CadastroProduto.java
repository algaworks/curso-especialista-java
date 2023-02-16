package com.algaworks.estoque;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class CadastroProduto {

    private final List<Produto> produtos;

    public CadastroProduto() {
        Categoria categoriaChurrasco = new Categoria("Churrasco");
        Categoria categoriaCarnes = new Categoria("Carnes");
        Categoria categoriaBebidas = new Categoria("Bebidas");
        Categoria categoriaOutros = new Categoria("Outros");

        Fabricante fabricanteDiPrima = new Fabricante("Di Prima");
        Fabricante fabricanteCocaCola = new Fabricante("Coca-cola");
        Fabricante fabricanteCorona = new Fabricante("Corona");
        Fabricante fabricanteCisne = new Fabricante("Cisne");

        this.produtos = Arrays.asList(
                new Produto("Picanha", new BigDecimal("100"), 0,
                        fabricanteDiPrima, Produto.Status.INATIVO, categoriaCarnes, categoriaChurrasco),
                new Produto("Cupim", new BigDecimal("80"), 10,
                        fabricanteDiPrima, Produto.Status.INATIVO, categoriaCarnes, categoriaChurrasco),
                new Produto("Suco", new BigDecimal("23"), 20,
                        fabricanteCocaCola, Produto.Status.INATIVO, categoriaBebidas),
                new Produto("Cerveja", new BigDecimal("14"), 110,
                        fabricanteCorona, Produto.Status.INATIVO, categoriaBebidas, categoriaChurrasco),
                new Produto("Refri", new BigDecimal("20"), 15,
                        fabricanteCocaCola, Produto.Status.INATIVO, categoriaBebidas),
                new Produto("Sal", new BigDecimal("5"), 0,
                        fabricanteCisne, Produto.Status.INATIVO, categoriaOutros, categoriaChurrasco),
                new Produto("Café", new BigDecimal("5"), 0,
                        fabricanteCisne, Produto.Status.INATIVO, categoriaOutros)
        );
    }

    public List<Produto> obterTodos() {
        return produtos;
    }

}
