package com.algaworks.vendas;

import java.math.BigDecimal;
import java.util.Objects;

public class ItemPedido {

    private Pedido pedido;
    private final String descricao;
    private final BigDecimal valorUnitario;
    private int quantidade;

    ItemPedido(String descricao, int quantidade, BigDecimal valorUnitario, Pedido pedido) {
        Objects.requireNonNull(pedido);
        Objects.requireNonNull(descricao);
        Objects.requireNonNull(valorUnitario);

        if (valorUnitario.compareTo(BigDecimal.ZERO) < 1) {
            throw new IllegalArgumentException("Valor unitário deve ser mair que zero");
        }

        this.pedido = pedido;
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
        setQuantidade(quantidade);
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        pedido.checarPedidoParaModificacao();

        if (quantidade < 1) {
            throw new IllegalArgumentException("Quantidade deve ser maior que zero");
        }

        pedido.valorTotal = pedido.valorTotal.subtract(calcularValorTotal(this.quantidade));
        this.quantidade = quantidade;
        pedido.valorTotal = pedido.valorTotal.add(calcularValorTotal(quantidade));
    }

    public BigDecimal getValorTotal() {
        return calcularValorTotal(this.quantidade);
    }

    private BigDecimal calcularValorTotal(int quantidade) {
        return valorUnitario.multiply(new BigDecimal(quantidade));
    }

}