import com.algaworks.crm.Cliente;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
//        var clientes = new ArrayList<Cliente>();
        clientes.add(new Cliente("Supermercado Pague e Leve", 2_000_000));
        clientes.add(new Cliente("Posto Gasolina Boa", 800_000));
//        clientes.add("José");

        double totalFaturamento = 0d;

        for (Cliente cliente : clientes) {
            totalFaturamento += cliente.getFaturamentoMensal();
        }

        System.out.println(totalFaturamento);
    }

}