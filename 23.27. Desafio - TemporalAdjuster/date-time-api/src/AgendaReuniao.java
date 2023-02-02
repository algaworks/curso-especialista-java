import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;
import java.util.Scanner;

public class AgendaReuniao {

    private static final Scanner ENTRADA = new Scanner(System.in);
    private static final DateTimeFormatter FORMATADOR_ANO_MES = DateTimeFormatter
            .ofPattern("MMMM 'de' yyyy", new Locale("pt", "BR"));
    private static final DateTimeFormatter FORMATADOR_DATA_COMPLETA = DateTimeFormatter
            .ofLocalizedDate(FormatStyle.FULL)
            .withLocale(new Locale("pt", "BR"));

    public static void main(String[] args) {
        System.out.print("Ano: ");
        Year ano = Year.of(ENTRADA.nextInt());

        System.out.print("Mês inicial: ");
        Month mesInicial = Month.of(ENTRADA.nextInt());

        YearMonth anoMes = ano.atMonth(mesInicial);

        System.out.printf("Gerando agenda anual de reuniões desde %s...%n",
                anoMes.format(FORMATADOR_ANO_MES));

        for (int mes = anoMes.getMonthValue(); mes <= Month.DECEMBER.getValue(); mes++) {
            LocalDate dataReuniao = anoMes.withMonth(mes).atDay(1)
                    .with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
            System.out.println(dataReuniao.format(FORMATADOR_DATA_COMPLETA));
        }
    }

}
