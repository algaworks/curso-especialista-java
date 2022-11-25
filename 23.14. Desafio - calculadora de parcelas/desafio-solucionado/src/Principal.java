import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Principal {

    private static final DateTimeFormatter FORMATADOR_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Data da primeira parcela: ");
        String dataParcelaTexto = entrada.nextLine();

        System.out.print("Quantidade de parcelas: ");
        int quantidadeParcelas = entrada.nextInt();

        LocalDate dataParcela = LocalDate.parse(dataParcelaTexto, FORMATADOR_DATA);

        CalculadoraParcelas calculadora = new CalculadoraParcelas();
        List<LocalDate> datasParcelas = calculadora.calcular(dataParcela, quantidadeParcelas);

        imprimirParcelas(datasParcelas);
    }

    private static void imprimirParcelas(List<LocalDate> datasParcelas) {
        for (int i = 0; i < datasParcelas.size(); i++) {
            System.out.printf("Parcela #%d - %s%n", i+1,
                    datasParcelas.get(i).format(FORMATADOR_DATA));
        }
    }

}