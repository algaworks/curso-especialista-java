public class FolhaPagamento {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Nome: ");
    String nome = entrada.nextLine();

    System.out.print("Valor por hora: ");
    double valorHora = entrada.nextDouble();

    System.out.print("Horas trabalhadas: ");
    int horasTrabalhadas = entrada.nextInt();

    System.out.print("Valor dos descontos: ");
    double valorDescontos = entrada.nextDouble();

    double valorTotalTrabalhado = valorHora * horasTrabalhadas;
    double valorTotalDevido = valorTotalTrabalhado - valorDescontos;

    System.out.printf("%nFolha de pagamento: %s%n", nome);
    System.out.printf("%d horas x R$%.2f = R$%.2f%n", 
        horasTrabalhadas, valorHora, valorTotalTrabalhado);
    System.out.printf("Descontos: R$%.2f%n", valorDescontos);
    System.out.printf("Total devido: R$%.2f%n", valorTotalDevido);
  }

}
