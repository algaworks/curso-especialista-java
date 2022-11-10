import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Principal {

    private static final DateFormat FORMATADOR_DATA = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) throws ParseException {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Data da primeira parcela: ");
        String dataParcelaTexto = entrada.nextLine();

        System.out.print("Quantidade de parcelas: ");
        int quantidadeParcelas = entrada.nextInt();

        Date dataParcela = FORMATADOR_DATA.parse(dataParcelaTexto);

        Calendar calendario = Calendar.getInstance();
        calendario.setTime(dataParcela);

        CalculadoraParcelas calculadora = new CalculadoraParcelas();
        List<Date> datasParcelas = calculadora.calcular(dataParcela, quantidadeParcelas);

        imprimirParcelas(datasParcelas);
    }

    private static void imprimirParcelas(List<Date> datasParcelas) {
        for (int i = 0; i < datasParcelas.size(); i++) {
            System.out.printf("Parcela #%d - %s%n", i+1,
                    FORMATADOR_DATA.format(datasParcelas.get(i)));
        }
    }

}