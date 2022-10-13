package com.algaworks.agencia;

import java.util.*;

public class CadastroPacoteViagem {

//    private final List<PacoteViagem> pacotes = new ArrayList<>();
    private final List<PacoteViagem> pacotes = new LinkedList<>();

    public void adicionar(String descricao, double precoDiaria) {
        PacoteViagem pacote = new PacoteViagem(descricao, precoDiaria);

        if (pacotes.contains(pacote)) {
            throw new PacoteViagemDuplicadoException("Pacote de viagem com esta descrição já foi adicionado");
        }

        pacotes.add(pacote);
    }

    public List<PacoteViagem> obterTodos() {
        return pacotes;
    }

    public void ordenar() {
        Collections.sort(pacotes);
    }

    public void ordenarPorPrecoDecrescente() {
        pacotes.sort(new PrecoPacoteViagemComparator().reversed());
    }

    public void removerPorDescricao(String descricao) {
        boolean removido = false;
        Iterator<PacoteViagem> pacotesIterator = pacotes.iterator();

        while (pacotesIterator.hasNext()) {
            PacoteViagem pacote = pacotesIterator.next();
            if (pacote.getDescricao().equals(descricao)) {
                pacotesIterator.remove();
                removido = true;
            }
        }

        if (!removido) {
            throw new PacoteViagemNaoEncontradoException("Pacote de viagem não encontrado com descrição");
        }
    }

    public PacoteViagem buscarPorDescricao(String descricao) {
        for (PacoteViagem pacote : pacotes) {
            if (pacote.getDescricao().equals(descricao)) {
                return pacote;
            }
        }

        throw new PacoteViagemNaoEncontradoException("Pacote de viagem não encontrado");
    }

}
