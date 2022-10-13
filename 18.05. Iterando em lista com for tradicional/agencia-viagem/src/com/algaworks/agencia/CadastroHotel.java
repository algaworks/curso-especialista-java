package com.algaworks.agencia;

import java.util.ArrayList;

public class CadastroHotel {

    private final ArrayList hoteis = new ArrayList();

    public void adicionar(String nome, String cidade, double precoDiaria) {
        hoteis.add(new Hotel(nome, cidade, precoDiaria));
    }

    public ArrayList obterTodos() {
        return hoteis;
    }

}
