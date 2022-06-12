public class Principal2 {

    public static void main(String[] args) {
        Integer idade = null;

        // NullPointerException em todas as instruções abaixo
        System.out.println(idade + 10);
        System.out.println(idade == 100);
        System.out.println(idade.equals(100));
    }

}
