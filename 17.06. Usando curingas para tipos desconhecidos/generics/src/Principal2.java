import java.util.ArrayList;

public class Principal2 {

    public static void main(String[] args) {
        ArrayList<Double> numeros = new ArrayList<>();
        numeros.add(20d);
        numeros.add(10d);
        numeros.add(21d);
        System.out.println(calcularMedia(numeros));

        ArrayList<Integer> numeros2 = new ArrayList<>();
        numeros2.add(20);
        numeros2.add(10);
        numeros2.add(21);
        System.out.println(calcularMedia(numeros2));
    }

    private static double calcularMedia(ArrayList<? extends Number> numeros) {
        double total = 0;

        for (Number numero : numeros) {
            total = total + numero.doubleValue();
        }

        return total / numeros.size();
    }

}