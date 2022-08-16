import com.algaworks.banco.Conta;
import com.algaworks.banco.Titular;

public class Principal1 {

    public static void main(String[] args) {
        Conta conta1 = new Conta(0);
        conta1.setTitular(new Titular("João da Silva", "12312312300"));
        conta1.setAgencia(1234);
        conta1.setNumero(999999);

        conta1.imprimirDemonstrativo();

        conta1.depositar(100);
        conta1.imprimirDemonstrativo();

        conta1.sacar(27.5);
        conta1.imprimirDemonstrativo();
    }

}