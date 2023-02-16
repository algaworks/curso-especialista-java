import com.algaworks.comercial.Cliente;
import com.algaworks.comercial.ServicoDeVenda;
import com.algaworks.comercial.Venda;

import java.util.*;

public class Principal2 {

    public static void main(String[] args) {
        var servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodas();

        vendas.stream()
                .filter(Venda::isFechada)
                .map(Venda::getCliente)
                .distinct()
                .sorted(Comparator.comparing(Cliente::nome))
                .forEach(System.out::println);
    }

}
