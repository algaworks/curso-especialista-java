import java.util.Arrays;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        Integer[] numeros1 = { 1, 2 };
        List<Integer> numeros2 = Arrays.asList(numeros1);

//        numeros1[0] = 5;
        numeros2.set(0, 4);

//        numeros2.add(10);

        System.out.println(Arrays.toString(numeros1));
        System.out.println(numeros2);

//        for (int i = 0; i < numeros1.length; i++) {
//            System.out.println(numeros1[i]);
//        }
//
        for (int i = 0; i < numeros2.size(); i++) {
            System.out.println(numeros2.get(i));
        }
    }

}
