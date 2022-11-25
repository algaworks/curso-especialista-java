import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Principal3 {

    public static void main(String[] args) {
        ZonedDateTime dataHoraFusoSaoPaulo = ZonedDateTime
                .parse("2022-11-20T20:00:00-03:00[America/Sao_Paulo]");

        Instant instante = dataHoraFusoSaoPaulo.toInstant();

        LocalDateTime dataHoraLocalLosAngeles = LocalDateTime
                .ofInstant(instante, ZoneId.of("America/Los_Angeles"));

        System.out.println(dataHoraFusoSaoPaulo);
        System.out.println(instante);
        System.out.println(dataHoraLocalLosAngeles);
    }

}
