import java.math.BigDecimal;

public class Conta {

    private BigDecimal saldo;

    public Conta(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public Transacao efetuarPagamento(BigDecimal valor) {
        BigDecimal taxa = valor.multiply(new BigDecimal("0.10"));
        saldo = saldo.subtract(taxa).subtract(valor);

        class Pagamento implements Transacao {

            @Override
            public BigDecimal getValorTotal() {
                return valor.add(taxa);
            }

            @Override
            public void reembolsar() {
                saldo = saldo.add(taxa).add(valor);
            }

        }

        return new Pagamento();
    }

    public Transacao cobrarTarifa(BigDecimal valor) {
        saldo = saldo.subtract(valor);

        class Tarifa implements Transacao {

            @Override
            public BigDecimal getValorTotal() {
                return valor;
            }

            @Override
            public void reembolsar() {
                saldo = saldo.add(valor);
            }

        }

        return new Tarifa();
    }

}