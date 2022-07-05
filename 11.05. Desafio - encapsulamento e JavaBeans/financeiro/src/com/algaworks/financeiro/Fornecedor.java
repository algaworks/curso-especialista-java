package com.algaworks.financeiro;

import java.io.Serializable;

public class Fornecedor implements Serializable {

    private String nome;

    public Fornecedor() {
    }

    public Fornecedor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
