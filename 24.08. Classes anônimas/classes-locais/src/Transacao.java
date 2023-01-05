import java.math.BigDecimal;

public interface Transacao {

    BigDecimal getValorTotal();
    void reembolsar();

}