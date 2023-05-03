package com.algaworks.comercial.repositorio.mysql;

import com.algaworks.comercial.repositorio.FabricaDeRepositorio;
import com.algaworks.comercial.repositorio.PersistenciaException;
import com.algaworks.comercial.repositorio.VendaRepositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MySQLFabricaDeRepositorio implements FabricaDeRepositorio {

    private final Connection conexao;

    public MySQLFabricaDeRepositorio(Properties properties) {
        try {
            this.conexao = DriverManager.getConnection(
                    properties.getProperty("conexao.url"),
                    properties.getProperty("conexao.usuario"),
                    properties.getProperty("conexao.senha"));
        } catch (SQLException e) {
            throw new PersistenciaException("Erro estabelecendo conexão", e);
        }
    }

    @Override
    public VendaRepositorio criarVendaRepositorio() {
        return new MySQLVendaRepositorio(conexao);
    }

    @Override
    public void close() {
        try {
            conexao.close();
        } catch (SQLException e) {
            throw new PersistenciaException(e);
        }
    }

}
