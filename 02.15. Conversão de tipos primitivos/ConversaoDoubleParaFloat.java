public class ConversaoDoubleParaFloat {

  public static void main(String[] args) {
    double peso1 = 20.5;

    float peso2 = (float) peso1;

    System.out.println(peso1);
    System.out.println(peso2);


    float taxa1 = 934.5f;
    // double taxa2 = taxa1;
    double taxa2 = (double) taxa1; // instrução de casting é opcional

    System.out.println(taxa1);
    System.out.println(taxa2);
  }

}