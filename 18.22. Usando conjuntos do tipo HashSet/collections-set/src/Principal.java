import java.util.HashSet;
import java.util.Set;

public class Principal {

    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();
        numeros.add(100);
        numeros.add(10);
        numeros.add(200);
        numeros.add(3);
        System.out.println(numeros.add(5));
        System.out.println(numeros.add(5));
        numeros.add(null);
        numeros.add(null);

        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }

}
