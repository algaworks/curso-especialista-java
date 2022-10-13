package com.algaworks.comercial;

import java.util.Objects;

public final class ItemVenda {

    private final String descricao;
    private final double valor;

    public ItemVenda(String descricao, double valor) {
        Objects.requireNonNull(descricao);

        if (valor < 0) {
            throw new IllegalArgumentException("Valor do item deve ser positivo");
        }

        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "ItemVenda{" +
                "descricao='" + descricao + '\'' +
                ", valor=" + valor +
                '}';
    }

}
