import java.util.Scanner;

public class AvaliacaoAtendimento {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Avalie o nosso atendimento (1 a 5): ");
    int nota = entrada.nextInt();

    String descricaoNota;

    switch (nota) {
      case 1:
        descricaoNota = "Muito ruim";
      case 2:
        descricaoNota = "Ruim";
      case 3:
        descricaoNota = "Razoável";
      case 4:
        descricaoNota = "Muito bom";
      case 5:
        descricaoNota = "Excelente";
      default:
        descricaoNota = "Opção inválida";
    }

    /*
    if (nota == 1) {
      descricaoNota = "Muito ruim";
    } else if (nota == 2) {
      descricaoNota = "Ruim";
    } else if (nota == 3) {
      descricaoNota = "Razoável";
    } else if (nota == 4) {
      descricaoNota = "Muito bom";
    } else if (nota == 5) {
      descricaoNota = "Excelente";
    } else {
      descricaoNota = "Opção inválida";
    }
    */

    System.out.printf("Sua nota foi: %d - %s%n", nota, descricaoNota);
  }

}