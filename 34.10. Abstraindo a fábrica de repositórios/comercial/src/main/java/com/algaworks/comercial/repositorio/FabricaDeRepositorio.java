package com.algaworks.comercial.repositorio;

import com.algaworks.comercial.repositorio.memoria.MemoriaFabricaDeRepositorio;
import com.algaworks.comercial.repositorio.mysql.MySQLFabricaDeRepositorio;

public interface FabricaDeRepositorio extends AutoCloseable {

    public static FabricaDeRepositorio obterInstancia() {
        return new MemoriaFabricaDeRepositorio();
//        return new MySQLFabricaDeRepositorio();
    }

    VendaRepositorio criarVendaRepositorio();

    @Override
    void close();

}
