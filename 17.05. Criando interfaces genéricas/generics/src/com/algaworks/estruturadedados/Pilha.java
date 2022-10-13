package com.algaworks.estruturadedados;

import java.util.Arrays;

public class Pilha<E> implements Colecao<E> {

    private E[] itens;

    public Pilha() {
        itens = (E[]) new Object[0];
    }

    public void colocar(E item) {
        itens = Arrays.copyOf(itens, itens.length + 1);
        itens[itens.length - 1] = item;
    }

    public E retirar() {
        if (itens.length == 0) {
            throw new ColecaoVaziaException("Pilha sem itens");
        }

        E item = itens[itens.length - 1];
        itens = Arrays.copyOf(itens, itens.length - 1);

        return item;
    }

}