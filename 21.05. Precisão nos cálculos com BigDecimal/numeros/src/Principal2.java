import java.math.BigDecimal;

public class Principal2 {

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.depositar(new BigDecimal("1.0"));

        conta.sacar(new BigDecimal("0.10"));
        conta.sacar(new BigDecimal("0.20"));
        conta.sacar(new BigDecimal("0.30"));
        conta.sacar(new BigDecimal("0.40"));

        System.out.println(conta.getSaldo());
    }

}
