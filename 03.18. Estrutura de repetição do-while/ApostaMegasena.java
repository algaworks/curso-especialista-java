import java.util.Scanner;

public class ApostaMegasena {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int quantidadeNumeros = 0;

    do {
      System.out.print("Quantidade de números: ");
      quantidadeNumeros = entrada.nextInt();

      if (quantidadeNumeros < 6 || quantidadeNumeros > 15) {
        System.out.println("Quantidade de números deve ser entre 6 e 15.");
      }
    } while (quantidadeNumeros < 6 || quantidadeNumeros > 15);

    int numeroAtual = 1;
    String numerosEscolhidos = "";

    do {
      System.out.printf("Número %d/%d: ", numeroAtual, quantidadeNumeros);
      int numeroEscolhido = entrada.nextInt();

      if (numeroEscolhido < 1 || numeroEscolhido > 60) {
        System.out.println("Número deve ser de 1 a 60");
      } else {
        numerosEscolhidos += numeroEscolhido + " ";
        numeroAtual++;
      }
    } while (numeroAtual <= quantidadeNumeros);

    System.out.printf("Números escolhidos: %s%n", numerosEscolhidos);
  }

}