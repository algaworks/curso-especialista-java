import com.algaworks.comercial.ServicoDeVenda;
import com.algaworks.comercial.Venda;

import java.util.List;

public class Principal1 {

    public static void main(String[] args) {
        var servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodas();

        for (Venda venda : vendas) {
            if (venda.isFechada()) {
                System.out.println(venda);
            }
        }
    }

}
