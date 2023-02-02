import com.algaworks.ciaaerea.Reserva;
import com.algaworks.ciaaerea.ServicoDeBagagem;
import com.algaworks.ciaaerea.ServicoDeReserva;
import com.algaworks.ciaaerea.Voo;

public class Principal {

    public static void main(String[] args) {
        var servicoDeReserva = new ServicoDeReserva();
        var servicoDeBagagem = new ServicoDeBagagem(servicoDeReserva);
        var voo = new Voo("G31333", "UDI", "GRU");

        servicoDeReserva.adicionar(new Reserva("28A888", voo, "João da Silva"));
        servicoDeReserva.adicionar(new Reserva("28B111", voo, "Maria da Silva"));
        servicoDeReserva.adicionar(new Reserva("74F877", voo, "Sebastião Coelho"));

        servicoDeBagagem.contratar("28AXXX", 2);

        servicoDeReserva.getReservas().forEach(System.out::println);
    }

}
