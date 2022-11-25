import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Principal2 {

    public static void main(String[] args) {
        LocalDateTime dataLocalDaFesta = LocalDateTime.parse("2023-09-13T20:00:00");

//        ZonedDateTime dataDaFestaFusoPadrao = ZonedDateTime
//                .of(dataLocalDaFesta, ZoneId.of("America/Los_Angeles"));

        ZonedDateTime dataDaFestaFusoPadrao = dataLocalDaFesta
                .atZone(ZoneId.of("America/Los_Angeles"));

        System.out.println(dataLocalDaFesta);
        System.out.println(dataDaFestaFusoPadrao);
    }

}
