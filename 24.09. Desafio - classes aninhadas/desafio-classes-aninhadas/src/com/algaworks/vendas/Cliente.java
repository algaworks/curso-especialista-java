package com.algaworks.vendas;

import java.util.Objects;

public class Cliente {

    private String nome;

    public Cliente(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Objects.requireNonNull(nome);
        this.nome = nome;
    }

}
