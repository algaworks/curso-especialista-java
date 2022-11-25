import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Principal1 {

    public static void main(String[] args) {
        LocalDate dataHoje = LocalDate.now();
        System.out.println(dataHoje);

        LocalDate primeiraSegundaProximoMes = dataHoje
                .plusMonths(1)
                .with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        System.out.println(primeiraSegundaProximoMes);

        LocalDate dataUltimoDiaDomes = dataHoje.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(dataUltimoDiaDomes);

        LocalDate dataProximaSextaFeira = dataHoje.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println(dataProximaSextaFeira);
    }

}
