package com.algaworks.ciaaerea;

import java.util.Objects;
import java.util.Optional;

public class ServicoDeBagagem {

    private ServicoDeReserva servicoDeReserva;

    public ServicoDeBagagem(ServicoDeReserva servicoDeReserva) {
        Objects.requireNonNull(servicoDeReserva);
        this.servicoDeReserva = servicoDeReserva;
    }

    public void contratar(String codigoReserva, int quantidadeBagagens) {
        if (quantidadeBagagens <= 0) {
            throw new IllegalArgumentException("Quantidade de bagagens inválida");
        }
        // aqui poderia ter outras regras de negócio

        Optional<Reserva> reservaOptional = servicoDeReserva.buscar(codigoReserva);

        if (reservaOptional.isPresent()) {
            reservaOptional.get().adicionarBagagens(quantidadeBagagens);
        } else {
            throw new ReservaNaoEncontradaException("Reserva não existe");
        }
    }

}
