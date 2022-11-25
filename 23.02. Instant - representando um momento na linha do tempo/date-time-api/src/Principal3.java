import java.time.Instant;
import java.util.Date;

public class Principal3 {

    public static void main(String[] args) {
        Date data = new Date();
        Instant instante = data.toInstant();

        System.out.println(data);
        System.out.println(instante);
    }

}
