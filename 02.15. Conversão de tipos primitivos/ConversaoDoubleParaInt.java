public class ConversaoDoubleParaInt {

  public static void main(String[] args) {
    double largura = 100.37;
    // int tamanho = largura; // não compila

    int tamanho = (int) largura; // isso compila

    System.out.println(tamanho);
  }

}