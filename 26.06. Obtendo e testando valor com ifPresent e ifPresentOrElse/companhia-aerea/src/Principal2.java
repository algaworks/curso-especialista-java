import com.algaworks.ciaaerea.Reserva;
import com.algaworks.ciaaerea.ServicoDeReserva;
import com.algaworks.ciaaerea.Voo;

public class Principal2 {

    public static void main(String[] args) {
        var servicoDeReserva = new ServicoDeReserva();
        var voo = new Voo("G31333", "UDI", "GRU");

        servicoDeReserva.adicionar(new Reserva("28A888", voo, "João da Silva"));
        servicoDeReserva.adicionar(new Reserva("28B111", voo, "Maria da Silva"));
        servicoDeReserva.adicionar(new Reserva("74F877", voo, "Sebastião Coelho"));

//        servicoDeReserva.buscar("28AXXX")
//                .ifPresent(reserva -> reserva.adicionarBagagens(10));

        servicoDeReserva.buscar("28A888").ifPresentOrElse(
                reserva -> reserva.adicionarBagagens(10),
                () -> System.out.println("Reserva não encontrada"));

        servicoDeReserva.getReservas().forEach(System.out::println);
    }

}
