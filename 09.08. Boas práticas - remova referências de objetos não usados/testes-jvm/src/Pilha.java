import java.util.Arrays;

public class Pilha {

    static final int CAPACIDADE_INICIAL_PADRAO = 4;

    Cliente[] elementos = new Cliente[CAPACIDADE_INICIAL_PADRAO];
    int tamanho = 0;

    void adicionar(Cliente elemento) {
        garantirCapacidade();
        elementos[tamanho++] = elemento;
    }

    Cliente retirar() {
        if (tamanho == 0) {
            // seria melhor lançar exception (mas ainda não aprendemos isso)
            return null;
        }

        Cliente elemento = elementos[--tamanho];
        elementos[tamanho] = null;
        return elemento;

//        return elementos[--tamanho];
    }

    void imprimirEstatisticas() {
        System.out.printf("Tamanho atual: %d%n", tamanho);
        System.out.printf("Capacidade: %d%n%n", elementos.length);
    }

    private void garantirCapacidade() {
        if (elementos.length == tamanho) {
            elementos = Arrays.copyOf(elementos, tamanho + 10);
        }
    }

}