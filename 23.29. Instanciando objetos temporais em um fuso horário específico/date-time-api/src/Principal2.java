import java.time.LocalDateTime;
import java.time.ZoneId;

public class Principal2 {

    public static void main(String[] args) {
        ZoneId fusoLosAngeles = ZoneId.of("America/Los_Angeles");
        ZoneId fusoJapao = ZoneId.of("Japan");
        ZoneId fusoSaoPaulo = ZoneId.of("America/Sao_Paulo");

        LocalDateTime dataHoraLosAngeles = LocalDateTime.now(fusoLosAngeles);
        LocalDateTime dataHoraJapao = LocalDateTime.now(fusoJapao);
        LocalDateTime dataHoraSaoPaulo = LocalDateTime.now(fusoSaoPaulo);

        System.out.println(dataHoraLosAngeles);
        System.out.println(dataHoraJapao);
        System.out.println(dataHoraSaoPaulo);
    }

}
