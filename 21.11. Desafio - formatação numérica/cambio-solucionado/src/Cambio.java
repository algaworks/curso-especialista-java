import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Cambio {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Preço do produto em Dólares: ");
        String precoProdutoDigitado = scanner.nextLine();

        System.out.print("Preço de 1 Dólar em Real: ");
        String precoDolarDigitado = scanner.nextLine();

        DecimalFormat formatadorUs = new DecimalFormat("#,##0.00",
                new DecimalFormatSymbols(Locale.US));
        formatadorUs.setParseBigDecimal(true);

        DecimalFormat formatadorBrSemMoeda = new DecimalFormat("#,##0.00",
                new DecimalFormatSymbols(new Locale("pt", "BR")));
        formatadorBrSemMoeda.setParseBigDecimal(true);

        NumberFormat formatadorBrComMoeda = new DecimalFormat("¤ #,##0.00",
                new DecimalFormatSymbols(new Locale("pt", "BR")));

        BigDecimal precoProdutoEmDolares = (BigDecimal) formatadorUs.parse(precoProdutoDigitado);
        BigDecimal precoDolar = (BigDecimal) formatadorBrSemMoeda.parse(precoDolarDigitado);

        BigDecimal precoProdutoEmReais = precoProdutoEmDolares.multiply(precoDolar);

        System.out.printf("Preço do produto em Reais: %s%n",
                formatadorBrComMoeda.format(precoProdutoEmReais));
    }

}