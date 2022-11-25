import java.time.Period;
import java.time.Year;
import java.time.temporal.ChronoUnit;

public class Principal2 {

    public static void main(String[] args) {
        Year ano = Year.parse("2023");
//        Year anoFuturo = ano.plus(Period.parse("P10Y"));
//        Year anoFuturo = ano.plus(10, ChronoUnit.CENTURIES);
        Year anoFuturo = ano.plusYears(10);

        System.out.println(ano);
        System.out.println(anoFuturo);
    }

}
