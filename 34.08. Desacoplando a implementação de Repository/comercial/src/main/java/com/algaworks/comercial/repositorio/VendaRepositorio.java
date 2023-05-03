package com.algaworks.comercial.repositorio;

import com.algaworks.comercial.entidade.Venda;

import java.util.List;

public interface VendaRepositorio {
    Venda adicionar(Venda venda);

    List<Venda> consultar();
}
