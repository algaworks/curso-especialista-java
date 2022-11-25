import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;

public class Principal1 {

    public static void main(String[] args) {
//        YearMonth anoMes = YearMonth.now();
//        YearMonth anoMes = YearMonth.of(2022, Month.SEPTEMBER);
//        YearMonth anoMes = YearMonth.from(LocalDate.now());
        YearMonth anoMes = YearMonth.parse("2023-09");
        System.out.println(anoMes);

        LocalDate dataAniversario = anoMes.atDay(13);
        System.out.println(dataAniversario);

        LocalDate dataUltimoDiaDoMes = anoMes.atEndOfMonth();
        System.out.println(dataUltimoDiaDoMes);
    }

}
