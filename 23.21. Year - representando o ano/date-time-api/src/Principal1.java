import java.time.LocalDate;
import java.time.Year;

public class Principal1 {

    public static void main(String[] args) {
//        Year ano = Year.now();
//        Year ano = Year.of(2023);
//        Year ano = Year.from(LocalDate.now());
        Year ano = Year.parse("2024");

        System.out.println(ano);
        System.out.println(ano.isLeap());

        LocalDate diaDoProgramador = ano.atDay(256);
        System.out.println(diaDoProgramador);
    }

}
