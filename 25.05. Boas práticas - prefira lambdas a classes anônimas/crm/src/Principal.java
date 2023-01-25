import com.algaworks.crm.CadastroCliente;
import com.algaworks.crm.Cliente;
import com.algaworks.crm.Filtro;

import java.util.List;

public class Principal {

    private String nome;

    public static void main(String[] args) {
        new Principal().executar();
    }

    public void executar() {
        var cadastroCliente = new CadastroCliente();
        cadastroCliente.adicionar(new Cliente("João", 30));
        cadastroCliente.adicionar(new Cliente("Maria", 90));
        cadastroCliente.adicionar(new Cliente("Sebastião", 50));
        cadastroCliente.adicionar(new Cliente("Joaquina", 45));
        cadastroCliente.adicionar(new Cliente("Josefina", 25));

        int y = 1;

//        Filtro<Cliente> filtro = new Filtro<Cliente>() {
//            @Override
//            public boolean avaliar(Cliente cliente) {
//                int y = 10;
//                System.out.println(y);
//                return cliente.getIdade() > 40;
//            }
//        };

//        List<Cliente> clientes = cadastroCliente.consultar(filtro);

        List<Cliente> clientes = cadastroCliente.consultar((Cliente cliente) -> {
//            y++;
            System.out.println(y);
            boolean resultado = cliente.getIdade() > 40;
            return resultado;
        });

        for (Cliente cliente : clientes) {
            System.out.printf("%s - %d%n", cliente.getNome(), cliente.getIdade());
        }
    }

}