package com.algaworks.crm;

import java.math.BigDecimal;

public class Cliente {

    private String nome;
    private final Endereco endereco;
    private BigDecimal limiteCredito;

    public Cliente(String nome, Endereco endereco, BigDecimal limiteCredito) {
        this.nome = nome;
        this.endereco = endereco;
        this.limiteCredito = limiteCredito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public BigDecimal getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(BigDecimal limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    @Override
    public String toString() {
        return "com.algaworks.crm.Cliente{" +
                "nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", limiteCredito=" + limiteCredito +
                '}';
    }

}
