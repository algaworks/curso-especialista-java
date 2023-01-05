import java.math.BigDecimal;

public class Principal {

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(new BigDecimal("1000"));
        System.out.println(conta.getSaldo());

        ContaCorrente.Transacao transacao1 = conta.new Transacao(
                "Compra no mercado", new BigDecimal("180.9"));

        ContaCorrente.Transacao transacao2 = conta.new Transacao(
                "Academia", new BigDecimal("170"));

        System.out.println(conta.getSaldo());

        for (ContaCorrente.Transacao transacao : conta.getTransacoes()) {
            System.out.printf("%s = %s%n", transacao.getDescricao(), transacao.getValor());
        }
    }

}