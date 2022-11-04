import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;

public class Principal {

    public static void main(String[] args) throws ParseException {
        String texto = "1.000,43";

        DecimalFormat formatador = new DecimalFormat("#,##0.00");
        formatador.setParseBigDecimal(true);

        BigDecimal valor = (BigDecimal) formatador.parse(texto);
        BigDecimal total = valor.add(new BigDecimal("1000"));

        System.out.println(total);
    }

}