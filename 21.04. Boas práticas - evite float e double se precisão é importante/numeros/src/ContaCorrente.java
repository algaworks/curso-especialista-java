public class ContaCorrente {

    private double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valorSaque) {
        if (valorSaque > saldo) {
            throw new RuntimeException(
                    String.format("Saque: %s, Saldo: %s", valorSaque, saldo));
        }

        saldo -= valorSaque;
    }

    public double getSaldo() {
        return saldo;
    }

}