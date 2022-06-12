import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {
        int[] numerosJogoAtual = {25, 11, 8, 46, 37, 14, 55};
        int[] numerosNovoJogo = new int[numerosJogoAtual.length - 1];

        int indiceExclusao = 2;

        System.arraycopy(numerosJogoAtual, 0,
                numerosNovoJogo, 0, indiceExclusao);

        System.arraycopy(numerosJogoAtual, indiceExclusao + 1,
                numerosNovoJogo, indiceExclusao, numerosNovoJogo.length - indiceExclusao);

        System.out.println(Arrays.toString(numerosJogoAtual));
        System.out.println(Arrays.toString(numerosNovoJogo));
    }

}
