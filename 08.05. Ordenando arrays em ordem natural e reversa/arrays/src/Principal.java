import java.util.Arrays;
import java.util.Comparator;

public class Principal {

    public static void main(String[] args) {
        // int[] notas = {8, 5, 4, 10, 9};
        Integer[] notas = {8, 5, 4, 10, 9};

        // Ordem natural
        // Arrays.sort(notas);

        // Ordem decrescente
        Arrays.sort(notas, Comparator.reverseOrder());

        System.out.println(Arrays.toString(notas));
    }

}
