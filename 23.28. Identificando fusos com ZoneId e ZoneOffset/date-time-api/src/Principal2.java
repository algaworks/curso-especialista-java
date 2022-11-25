import java.time.ZoneId;
import java.time.ZoneOffset;

public class Principal2 {

    public static void main(String[] args) {
        ZoneId offset1 = ZoneId.of("-03:00");
        System.out.println(offset1);
        System.out.println(offset1.getClass());

        ZoneId offset2 = ZoneOffset.UTC;
        System.out.println(offset2);

        ZoneId offset3 = ZoneOffset.of("-03:00");
        System.out.println(offset3);

        ZoneId offset4 = ZoneOffset.ofHours(-3);
        System.out.println(offset4);
    }

}
