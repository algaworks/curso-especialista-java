import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Principal1 {

    public static void main(String[] args) {
        LocalDateTime dataHoraCompra = LocalDateTime.parse("2022-11-12T21:30:00");
        LocalDateTime dataHoraEntrega = LocalDateTime.parse("2022-11-12T22:10:10");

        Duration tempoEntrega = Duration.between(dataHoraCompra, dataHoraEntrega);
        System.out.println(tempoEntrega);

//        long tempoEntregaSegundos = dataHoraCompra.until(dataHoraEntrega, ChronoUnit.SECONDS);
        long tempoEntregaSegundos = ChronoUnit.SECONDS.between(dataHoraCompra, dataHoraEntrega);
        System.out.println(tempoEntregaSegundos);
    }

}
