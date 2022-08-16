import com.algaworks.banco.Conta;
import com.algaworks.banco.ContaInvestimento;
import com.algaworks.banco.Titular;

public class Principal2 {

    public static void main(String[] args) {
        ContaInvestimento conta1 = new ContaInvestimento();
        conta1.setTitular(new Titular("João da Silva", "12312312300"));
        conta1.setAgencia(1234);
        conta1.setNumero(999999);

        conta1.imprimirDemonstrativo();

        conta1.depositar(100);
        conta1.imprimirDemonstrativo();

        conta1.creditarRendimentos(6);
        conta1.imprimirDemonstrativo();
    }

}