package com.algaworks.crm.entidade;

import com.algaworks.csv.Campo;

import java.math.BigDecimal;

public class Produto {

    @Campo
    private final Long codigo;
    @Campo
    private String descricao;
    @Campo
    private BigDecimal precoUnitario;
    private Integer quantidadeEstoque;

    public Produto(Long codigo, String descricao, BigDecimal precoUnitario, Integer quantidadeEstoque) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoUnitario = precoUnitario;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Long getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getPrecoUnitario() {
        return precoUnitario;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPrecoUnitario(BigDecimal precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

}
