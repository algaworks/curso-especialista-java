package com.algaworks.comercial.repositorio;

import com.algaworks.comercial.repositorio.mysql.MySQLVendaRepositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaDeRepositorio implements AutoCloseable {

    private final Connection conexao;

    public FabricaDeRepositorio() {
        try {
            this.conexao = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/comercial", "root", "");
        } catch (SQLException e) {
            throw new PersistenciaException(e);
        }
    }

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
