import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;

public class ConviteFesta {

    private static final Scanner ENTRADA = new Scanner(System.in);
    private static final DateTimeFormatter FORMATADOR_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter FORMATADOR_HORARIO = DateTimeFormatter.ofPattern("HH:mm");
    private static final DateTimeFormatter FORMATADOR_COMPLETO = DateTimeFormatter
            .ofPattern("dd 'de' MMMM 'de' yyyy 'às' HH:mm (zzzz)")
            .withLocale(new Locale("pt", "BR"));

    public static void main(String[] args) {
        LocalDate dataLocalFesta = requisitarData("Data local da festa: ");
        LocalTime horaLocalFesta = requisitarHorario("Horário local da festa: ");

        ZonedDateTime dataFestaFusoPadrao = dataLocalFesta.atTime(horaLocalFesta)
                .atZone(ZoneId.systemDefault());

        ZonedDateTime dataFestaSaoPaulo = dataFestaFusoPadrao
                .withZoneSameInstant(ZoneId.of("America/Sao_Paulo"));

        ZonedDateTime dataFestaLosAngeles = dataFestaFusoPadrao
                .withZoneSameInstant(ZoneId.of("America/Los_Angeles"));

        ZonedDateTime dataFestaJapao = dataFestaFusoPadrao
                .withZoneSameInstant(ZoneId.of("Japan"));

        System.out.println(dataFestaSaoPaulo.format(FORMATADOR_COMPLETO));
        System.out.println(dataFestaLosAngeles.format(FORMATADOR_COMPLETO));
        System.out.println(dataFestaJapao.format(FORMATADOR_COMPLETO));
    }

    private static LocalDate requisitarData(String descricao) {
        while (true) {
            try {
                System.out.print(descricao);
                String dataTexto = ENTRADA.nextLine();

                return LocalDate.parse(dataTexto, FORMATADOR_DATA);
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida. Tente novamente");
            }
        }
    }

    private static LocalTime requisitarHorario(String descricao) {
        while (true) {
            try {
                System.out.print(descricao);
                String horarioTexto = ENTRADA.nextLine();

                return LocalTime.parse(horarioTexto, FORMATADOR_HORARIO);
            } catch (DateTimeParseException e) {
                System.out.println("Horário inválido. Tente novamente");
            }
        }
    }

}