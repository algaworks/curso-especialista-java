public class OperadoresComparacao {

  public static void main(String[] args) {
    int pesoProdutos = 900;
    int limitePesoCaminhao = 1000;

    boolean cargaExcedida = pesoProdutos > limitePesoCaminhao;
    System.out.printf("Carga excedida: %b%n", cargaExcedida);

    // boolean cargaLiberada = pesoProdutos < limitePesoCaminhao;
    // boolean cargaLiberada = pesoProdutos <= limitePesoCaminhao;
    boolean cargaLiberada = limitePesoCaminhao >= pesoProdutos;
    System.out.printf("Carga liberada: %b%n", cargaLiberada);    
  }

}