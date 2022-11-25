import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Principal2 {

    public static void main(String[] args) {
        ZonedDateTime dataFestaSaoPaulo = ZonedDateTime
                .parse("2023-09-13T20:00:00-03:00[America/Sao_Paulo]");

//        ZonedDateTime dataFestaLosAngeles = dataFestaSaoPaulo
//                .withZoneSameLocal(ZoneId.of("America/Los_Angeles"));

        ZonedDateTime dataFestaLosAngeles = dataFestaSaoPaulo
                .withZoneSameInstant(ZoneId.of("America/Los_Angeles"));

        System.out.println(dataFestaSaoPaulo);
        System.out.println(dataFestaLosAngeles);

        System.out.println(dataFestaSaoPaulo.equals(dataFestaLosAngeles));
        System.out.println(dataFestaSaoPaulo.isEqual(dataFestaLosAngeles));
    }

}
