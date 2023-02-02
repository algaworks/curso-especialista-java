package com.algaworks.ciaaerea;

import java.util.*;
import java.util.function.Supplier;

public class ServicoDeReserva {

    private final Set<Reserva> reservas = new HashSet<>();

    public Collection<Reserva> getReservas() {
        return Collections.unmodifiableSet(reservas);
    }

    public void adicionar(Reserva reserva) {
        boolean reservaAdicionada = reservas.add(reserva);

        if (!reservaAdicionada) {
            throw new RuntimeException(
                    String.format("Reserva %s já existe", reserva.getCodigo()));
        }
    }

    public Reserva buscar(String codigo, Supplier<Reserva> supplierNaoExiste) {
        return buscar(codigo).orElseGet(supplierNaoExiste);
    }

    public Optional<Reserva> buscar(String codigo) {
        for (Reserva reserva : reservas) {
            if (reserva.getCodigo().equals(codigo)) {
                return Optional.of(reserva);
            }
        }

        return Optional.empty();
    }

}