import java.util.Scanner;

public class HorarioFuncionamento {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite um dia da semana (ex: seg, ter, qua, etc): ");
    String diaSemana = entrada.nextLine();
    String horarioFuncionamento;

    switch (diaSemana) {
      case "seg":
        horarioFuncionamento = "Fechado";
        break;
      case "ter":
      case "qua":
      case "qui":
      case "sex":
        horarioFuncionamento = "08:00 às 18:00";
        break;
      case "sab":
      case "dom":
        horarioFuncionamento = "08:00 às 12:00";
        break;
      default:
        horarioFuncionamento = "Dia inválido";
    }

    System.out.printf("Horário de funcionamento: %s%n", horarioFuncionamento);
  }

}