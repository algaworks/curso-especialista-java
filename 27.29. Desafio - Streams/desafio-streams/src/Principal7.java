import com.algaworks.comercial.ServicoDeVenda;
import com.algaworks.comercial.Venda;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Principal7 {

    public static void main(String[] args) {
        var servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodas();

        Map<String, Long> vendasRealizadasPorCliente = new HashMap<>();

        for (Venda venda : vendas) {
            if (venda.isFechada()) {
                String nomeCliente = venda.getCliente().nome();
                Long quantidadeVendas = vendasRealizadasPorCliente.get(nomeCliente);
                if (quantidadeVendas == null) {
                    quantidadeVendas = 0L;
                }

                vendasRealizadasPorCliente.put(nomeCliente, quantidadeVendas + 1);
            }
        }

        System.out.println(vendasRealizadasPorCliente);
    }

}
