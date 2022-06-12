public class Principal {

    public static void main(String[] args) {
        int[] notas = {8, 5, 4, 9, 10};

        notas[0] = 10;
        notas[1] = 9;

        System.out.println(notas[0]);
        System.out.println(notas[1]);
        System.out.println(notas[3]);

        int totalNotas = notas[0] + notas[1] + notas[2] + notas[3] + notas[4];
        System.out.println(totalNotas);

        int posicao = 2;
        System.out.println(notas[posicao - 1]);
    }

}
