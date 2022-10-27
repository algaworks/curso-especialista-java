public class EqualsIgnoreCase {

    public static void main(String[] args) {
        String nome1 = "João";
        String nome2 = new String("JOÃO");

        System.out.println(nome1.equals(nome2)); // false
        System.out.println(nome1.equalsIgnoreCase(nome2)); // true
    }

}
