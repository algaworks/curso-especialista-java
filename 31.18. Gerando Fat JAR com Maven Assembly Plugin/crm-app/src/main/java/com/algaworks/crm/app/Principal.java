package com.algaworks.crm.app;

import com.algaworks.crm.api.CadastroCliente;
import com.algaworks.crm.api.Cliente;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class Principal {

    public static void main(String[] args) {
        var cadastroCliente = new CadastroCliente();
        cadastroCliente.adicionar(new Cliente("João da Silva", 30));
        cadastroCliente.adicionar(new Cliente("Maria Conceição", 90));
        cadastroCliente.adicionar(new Cliente("Sebastião das Couves", 50));
        cadastroCliente.adicionar(new Cliente("Joaquina de Jesus", 45));
        cadastroCliente.adicionar(new Cliente("Josefina Amaral", 25));

        List<Cliente> clientes = cadastroCliente.consultar(cliente -> cliente.getIdade() > 40);

        for (Cliente cliente : clientes) {
            System.out.printf("%s - %d%n", StringUtils.abbreviate(
                    cliente.getNome(), 15), cliente.getIdade());
        }
    }

}