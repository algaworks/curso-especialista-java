import java.util.Scanner;

public class Desafio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número positivo inteiro: ");
        int numero = entrada.nextInt();

        boolean numeroPrimo = true;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                numeroPrimo = false;
                break;
            }
        }

        if (numeroPrimo && numero > 1) {
            System.out.printf("%d é um número primo", numero);
        } else {
            System.out.printf("%d não é um número primo", numero);
        }
    }

}