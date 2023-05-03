package com.algaworks.comercial.repositorio.memoria;

import com.algaworks.comercial.repositorio.FabricaDeRepositorio;
import com.algaworks.comercial.repositorio.VendaRepositorio;

public class MemoriaFabricaDeRepositorio implements FabricaDeRepositorio {

    @Override
    public VendaRepositorio criarVendaRepositorio() {
        return new MemoriaVendaRepositorio();
    }

    @Override
    public void close() {
    }

}
