import java.time.LocalDateTime;

public class Principal {

    public static void main(String[] args) {
//        LocalDateTime dataHora = LocalDateTime.now();
        LocalDateTime dataHora = LocalDateTime
                .of(1981, 9, 13, 20, 55, 10);
        System.out.println(dataHora);
    }

}
