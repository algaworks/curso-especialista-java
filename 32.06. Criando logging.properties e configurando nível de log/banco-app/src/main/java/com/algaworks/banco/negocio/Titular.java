package com.algaworks.banco.negocio;

import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Titular {

    private static final Logger logger = Logger.getLogger(Titular.class.getName());

    private String nome;
    private final String cpf;

    public Titular(String nome, String cpf) {
        Objects.requireNonNull(nome);
        Objects.requireNonNull(cpf);

        this.nome = nome;
        this.cpf = cpf;

        if (this.nome.length() < 5) {
            logger.log(Level.WARNING, "Nome do titular ''{0}'' muito curto", this.nome);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Titular{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }

}