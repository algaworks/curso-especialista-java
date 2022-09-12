import com.algaworks.banco.ContaCorrente;

public class Principal1 {

    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("123");

        conta1.depositar(1_000);

        System.out.printf("Saldo da conta 1: %.2f%n", conta1.getSaldo());
    }

}
