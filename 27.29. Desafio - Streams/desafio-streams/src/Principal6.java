import com.algaworks.comercial.ServicoDeVenda;
import com.algaworks.comercial.Venda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal6 {

    public static void main(String[] args) {
        var servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodas();

        List<String> clientes = new ArrayList<>();

        for (Venda venda : vendas) {
            if (venda.isFechada()) {
                if (!clientes.contains(venda.getCliente().nome())) {
                    clientes.add(venda.getCliente().nome());
                }
            }
        }

        Collections.sort(clientes);
        System.out.println(clientes);
    }

}
