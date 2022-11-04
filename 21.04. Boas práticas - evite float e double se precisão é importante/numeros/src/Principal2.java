public class Principal2 {

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.depositar(1.0);

        conta.sacar(0.10);
        conta.sacar(0.20);
        conta.sacar(0.30);
        conta.sacar(0.40);

        System.out.println(conta.getSaldo());
    }

}
