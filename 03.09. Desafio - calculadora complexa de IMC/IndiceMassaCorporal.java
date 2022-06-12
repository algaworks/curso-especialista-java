import java.util.Scanner;

public class IndiceMassaCorporal {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Peso: ");
    int peso = entrada.nextInt();

    System.out.print("Altura: ");
    double altura = entrada.nextDouble();

    System.out.print("Sexo (1 para 'M' ou outro numero para 'F'): ");
    char sexo = 'M';

    if (entrada.nextShort() != 1) {
      sexo = 'F';
    }

    double imc = peso / (altura * altura);

    if ((sexo == 'F' && imc < 19.1) || (sexo == 'M' && imc < 20.7)) {
      System.out.println("Abaixo do peso.");
    } else if ((sexo == 'F' && imc <= 25.8) || (sexo == 'M' && imc <= 26.4)) {
      System.out.println("Peso ideal.");
    } else if ((sexo == 'F' && imc <= 27.3) || (sexo == 'M' && imc <= 27.8)) {
      System.out.println("Um pouco acima do peso.");
    } else if ((sexo == 'F' && imc <= 32.3) || (sexo == 'M' && imc <= 31.1)) {
      System.out.println("Acima do peso ideal.");
    } else {
      System.out.println("Obeso.");
    }
  }

}