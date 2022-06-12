public class Principal {

    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Bob";
        cachorro1.raca = "Boxer";
        cachorro1.sexo = 'M';
        cachorro1.idade = 2;

        Cachorro cachorro2 = new Cachorro();
        cachorro2.nome = "Zara";
        cachorro2.raca = "Poodle";
        cachorro2.sexo = 'F';
        cachorro2.idade = 1;

        System.out.println("CACHORRO 1");
        System.out.println("--------");
        System.out.printf("Nome: %s%n", cachorro1.nome);
        System.out.printf("Raça: %s%n", cachorro1.raca);
        System.out.printf("Sexo: %s%n", cachorro1.sexo);
        System.out.printf("Idade: %d%n", cachorro1.idade);

        System.out.println();

        System.out.println("CACHORRO 2");
        System.out.println("--------");
        System.out.printf("Nome: %s%n", cachorro2.nome);
        System.out.printf("Raça: %s%n", cachorro2.raca);
        System.out.printf("Sexo: %s%n", cachorro2.sexo);
        System.out.printf("Idade: %d%n", cachorro2.idade);
    }

}
