import com.algaworks.crm.Cliente;
import com.algaworks.crm.Endereco;

import java.math.BigDecimal;

public class Serializacao {

    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua das Ameixas", "1000", "Centro");
        Cliente cliente = new Cliente("João da Silva", endereco, new BigDecimal("100000"));

        System.out.println(cliente);

        // TODO implementar serialização
    }

}
