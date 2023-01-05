package com.algaworks.vendas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Pedido {

    private final Cliente cliente;
    private Status status = Status.RASCUNHO;
    private BigDecimal valorTotal = BigDecimal.ZERO;
    private final List<Item> itens = new ArrayList<>();

    public Pedido(Cliente cliente) {
        Objects.requireNonNull(cliente);
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Status getStatus() {
        return status;
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public Item adicionarItem(String descricao, int quantidade, BigDecimal valorUnitario) {
        Item item = new Item(descricao, quantidade, valorUnitario);
        itens.add(item);
        return item;
    }

    public void emitir() {
        checarPedidoParaModificacao();
        status = Status.EMITIDO;
    }

    public void cancelar() {
        checarPedidoParaModificacao();
        status = Status.CANCELADO;
    }

    private void checarPedidoParaModificacao() {
        if (!Status.RASCUNHO.equals(status)) {
            throw new IllegalArgumentException("Pedido não pode ser modificado");
        }
    }

    public enum Status {
        RASCUNHO, EMITIDO, CANCELADO
    }

    public class Item {

        private final String descricao;
        private final BigDecimal valorUnitario;
        private int quantidade;

        private Item(String descricao, int quantidade, BigDecimal valorUnitario) {
            Objects.requireNonNull(descricao);
            Objects.requireNonNull(valorUnitario);

            if (valorUnitario.compareTo(BigDecimal.ZERO) < 1) {
                throw new IllegalArgumentException("Valor unitário deve ser mair que zero");
            }

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
            checarPedidoParaModificacao();

            if (quantidade < 1) {
                throw new IllegalArgumentException("Quantidade deve ser maior que zero");
            }

            valorTotal = valorTotal.subtract(calcularValorTotal(this.quantidade));
            this.quantidade = quantidade;
            valorTotal = valorTotal.add(calcularValorTotal(quantidade));
        }

        public BigDecimal getValorTotal() {
            return calcularValorTotal(this.quantidade);
        }

        private BigDecimal calcularValorTotal(int quantidade) {
            return valorUnitario.multiply(new BigDecimal(quantidade));
        }

    }

}
