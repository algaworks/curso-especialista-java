import java.util.Scanner;

public class HorarioFuncionamento {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Dia da semana (ex: seg, ter, qua, etc): ");
    String diaSemana = entrada.nextLine();

    System.out.print("Mês: ");
    int mes = entrada.nextInt();

    System.out.printf("Horário de funcionamento: %s%n", switch (diaSemana) {
      case "seg" -> {
         if (mes == 12) {
           yield "08:00 às 16:00";
         }
         yield "Fechado";
      }
      case "ter", "qua", "qui", "sex" -> "08:00 às 18:00";
      case "sab", "dom" -> "08:00 às 12:00";
      default -> "Dia inválido";
    });

    /*
    String horarioFuncionamento = switch (diaSemana) {
      case "seg" -> "Fechado";
      case "ter", "qua", "qui", "sex" -> "08:00 às 18:00";
      case "sab", "dom" -> "08:00 às 12:00";
      default -> "Dia inválido";
    };
    */

    /*
    String horarioFuncionamento;

    switch (diaSemana) {
      case "seg" -> horarioFuncionamento = "Fechado";
      case "ter", "qua", "qui", "sex" -> horarioFuncionamento = "08:00 às 18:00";
      case "sab", "dom" -> {
        horarioFuncionamento = "08:00 às 12:00";
      }
      default -> horarioFuncionamento = "Dia inválido";
    }
    */

    // System.out.printf("Horário de funcionamento: %s%n", horarioFuncionamento);
  }

}