import java.time.LocalDate;
import java.time.Period;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;

public class Principal2 {

    public static void main(String[] args) {
        YearMonth anoMes = YearMonth.parse("2023-09");
//        YearMonth anoMesFuturo = anoMes.plus(Period.parse("P2Y5M"));
//        YearMonth anoMesFuturo = anoMes.plus(2, ChronoUnit.CENTURIES);
        YearMonth anoMesFuturo = anoMes.plusMonths(10);

        System.out.println(anoMesFuturo);

//        long tempoEmMeses = anoMes.until(YearMonth.of(2025, 10), ChronoUnit.MONTHS);
        long tempoEmMeses = anoMes.until(LocalDate.parse("2025-10-15"), ChronoUnit.MONTHS);
        System.out.println(tempoEmMeses);
    }

}
