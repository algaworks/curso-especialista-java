import java.time.LocalDateTime;

public class Principal2 {

    public static void main(String[] args) {
        LocalDateTime dataHoraCompra = LocalDateTime.parse("2022-11-25T21:05:54");
        System.out.println(dataHoraCompra.getDayOfMonth());
        System.out.println(dataHoraCompra.getHour());
        System.out.println(dataHoraCompra.getMinute());
    }

}
