package com.algaworks.ciaaerea;

import java.util.Objects;

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

        Reserva reserva = servicoDeReserva.buscar(codigoReserva);

        if (reserva == null) {
            throw new ReservaNaoEncontradaException("Reserva não existe");
        }

        reserva.adicionarBagagens(quantidadeBagagens);
    }

}
