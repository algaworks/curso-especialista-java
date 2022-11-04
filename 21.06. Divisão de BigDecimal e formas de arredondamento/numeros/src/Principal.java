import java.math.BigDecimal;
import java.math.RoundingMode;

public class Principal {

    public static void main(String[] args) {
        BigDecimal x = new BigDecimal("10.0");
        BigDecimal y = new BigDecimal("3.0");

//        BigDecimal z = x.divide(y, 4, RoundingMode.UP);
//        BigDecimal z = x.divide(y, 4, RoundingMode.DOWN);
        BigDecimal z = x.divide(y, 4, RoundingMode.HALF_EVEN);

        System.out.println(z);

        // 2.524 = 2.52
        // 2.526 = 2.53
        // 2.525 = 2.53
        // 2.425 = 2.42
    }

}