import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ExemploLocalDate {

    public static void main(String[] args) {
//        LocalDate data = LocalDate.parse("2026-10-03");
        LocalDate data = LocalDate.parse("03/10/2026",
                DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(data);
    }

}
