public class Calculadora {

    static double calcularMedia(int[] numeros) {
        int total = 0;

        // for aprimorado (enhanced for)
        for (int numero : numeros) {
            total += numero;
        }

        // for tradicional
//        for (int i = 0; i < numeros.length; i++) {
//            total += numeros[i];
//        }

        return (double) total / numeros.length;
    }

}
