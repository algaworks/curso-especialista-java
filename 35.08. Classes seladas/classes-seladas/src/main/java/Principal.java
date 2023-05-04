import com.algaworks.pagamento.CartaoDeCredito;
import com.algaworks.loja.Checkout;
import com.algaworks.pagamento.Pix;

import java.math.BigDecimal;

public class Principal {

    public static void main(String[] args) {
        var checkout = new Checkout();
        var cartao = new CartaoDeCredito(new BigDecimal("3.49"), 12);
        var pix = new Pix(new BigDecimal("0.79"), new BigDecimal("5"));

        BigDecimal valorTotal = new BigDecimal("2800");

        System.out.println(checkout.calcular(valorTotal, cartao));
        System.out.println(checkout.calcular(valorTotal, pix));
    }

}
