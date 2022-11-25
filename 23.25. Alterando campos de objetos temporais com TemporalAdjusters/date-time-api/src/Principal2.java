import java.time.LocalDate;

public class Principal2 {

    public static void main(String[] args) {
        LocalDate dataHoje = LocalDate.now();
        System.out.println(dataHoje);

        LocalDate dataNatal = dataHoje.with(new NatalTemporalAdjuster());
        System.out.println(dataNatal);
    }

}
