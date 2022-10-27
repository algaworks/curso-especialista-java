public class Strip {

    public static void main(String[] args) {
        String nome = "\n    Pedro     ";

        System.out.println(">" + nome + "<");
//        System.out.println(nome.stripLeading());
//        System.out.println(nome.stripTrailing());
        System.out.println(nome.strip());
//        System.out.println(nome.trim());
    }

}
