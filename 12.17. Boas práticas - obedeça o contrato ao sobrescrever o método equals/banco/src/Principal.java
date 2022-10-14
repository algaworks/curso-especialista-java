import com.algaworks.banco.Conta;
import com.algaworks.banco.Titular;

public class Principal {

    public static void main(String[] args) {
        Titular titular = new Titular("João da Silva", "12312312300");
        Conta conta1 = new Conta(titular, 1234, 999999);
        Conta conta2 = new Conta(titular, 1234, 999999);
        Conta conta3 = new Conta(titular, 1234, 999999);

        // Reflexivo
        System.out.println(conta1.equals(conta1)); // sempre true

        // Simétrico
        System.out.println(conta1.equals(conta2));
        System.out.println(conta2.equals(conta1));

        // Transitivo
        System.out.println(conta1.equals(conta2));
        System.out.println(conta2.equals(conta3));
        System.out.println(conta1.equals(conta3));

        // Consistente
        System.out.println(conta1.equals(conta2));
        System.out.println(conta1.equals(conta2));
        System.out.println(conta1.equals(conta2));

        // Teste com nulo sempre retorna false
        System.out.println(conta1.equals(null));
    }

}
