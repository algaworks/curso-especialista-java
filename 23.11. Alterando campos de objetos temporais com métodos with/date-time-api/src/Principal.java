import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class Principal {

    public static void main(String[] args) {
        LocalDateTime dataHoraAgora = LocalDateTime.now();
//        LocalDateTime novaDataHora = dataHoraAgora.with(ChronoField.DAY_OF_MONTH, 9);
        LocalDateTime novaDataHora = dataHoraAgora.withDayOfMonth(9)
                .withMonth(2)
                .withMinute(0)
                .withSecond(0);

        System.out.println(dataHoraAgora);
        System.out.println(novaDataHora);
    }

}
