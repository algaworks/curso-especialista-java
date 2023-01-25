package com.algaworks.crm;

@FunctionalInterface
public interface Filtro<T> {

    boolean avaliar(T objeto);

}