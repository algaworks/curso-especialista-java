import java.time.Month;
import java.time.MonthDay;
import java.time.Year;

public class Principal2 {

    public static void main(String[] args) {
        MonthDay diaDoMes = MonthDay.of(Month.FEBRUARY, 29);
        Year ano = Year.of(2023);

        System.out.println(ano.isValidMonthDay(diaDoMes));
    }

}
