import java.util.Arrays;

public class Calculadora {

    static double calcularMedia(double numeroA, double numeroB, double... demaisNumeros) {
        double[] todosNumeros = Arrays.copyOf(demaisNumeros, demaisNumeros.length + 2);
        todosNumeros[todosNumeros.length - 2] = numeroA;
        todosNumeros[todosNumeros.length - 1] = numeroB;

        double soma = 0;

        for (double numero : todosNumeros) {
            soma += numero;
        }

        return soma / todosNumeros.length;
    }

}
