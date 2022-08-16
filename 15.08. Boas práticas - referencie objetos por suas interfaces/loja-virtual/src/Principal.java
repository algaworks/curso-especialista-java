import com.algaworks.loja.Carrinho;
import com.algaworks.loja.ItemCarrinho;
import com.algaworks.loja.pagamento.CartaoCredito;
import com.algaworks.loja.pagamento.MetodoPagamento;

public class Principal {

    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        carrinho.adicionarItem(new ItemCarrinho("AirPods", 2_000));
        carrinho.adicionarItem(new ItemCarrinho("Apple Watch", 5_100));
        carrinho.adicionarItem(new ItemCarrinho("Magic Mouse", 600));

        MetodoPagamento metodoPagamento = new CartaoCredito("234234");

        carrinho.finalizar(metodoPagamento);
    }

}