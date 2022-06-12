import java.util.Arrays;

public class Principal1 {

    public static void main(String[] args) {
        int[] numerosJogo1 = {25, 11, 8, 46, 37, 14};
        int[] numerosJogo2 = Arrays.copyOf(numerosJogo1, numerosJogo1.length + 1);
        numerosJogo2[numerosJogo2.length - 1] = 44;

        System.out.println(Arrays.toString(numerosJogo1));
        System.out.println(Arrays.toString(numerosJogo2));
    }

}
