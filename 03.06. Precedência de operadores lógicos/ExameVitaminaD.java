import java.util.Scanner;

// Desejável: acima de 20 ng/ML
// Grupos de risco: 30 a 60 ng/mL
public class ExameVitaminaD {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Grupo de risco: ");
    boolean grupoDeRisco = entrada.nextBoolean();

    System.out.print("Vitamina D: ");
    double vitaminaD = entrada.nextDouble(); // nanograma por mililitro

    // boolean vitaminaDNormal = !grupoDeRisco && vitaminaD > 20
    //     || grupoDeRisco && vitaminaD >= 30 && vitaminaD <= 60;

    // agrupando as expressões lógicas para melhorar a legibilidade
    boolean vitaminaDNormal = (!grupoDeRisco && vitaminaD > 20)
        || (grupoDeRisco && vitaminaD >= 30 && vitaminaD <= 60);

    System.out.printf("Vitamina D normal: %b%n", vitaminaDNormal);
  }

}