import com.algaworks.estruturadedados.Colecao;
import com.algaworks.estruturadedados.ColecaoVaziaException;
import com.algaworks.estruturadedados.Fila;
import com.algaworks.estruturadedados.Pilha;
import com.algaworks.loja.Produto;

public class Principal1 {

    public static void main(String[] args) {
        Colecao<Produto> produtos = new Fila<>();
        produtos.colocar(new Produto("Arroz"));
        produtos.colocar(new Produto("Feijão"));
        produtos.colocar(new Produto("Água de coco"));

        retirarTodos(produtos);

        Colecao<String> nomes = new Pilha<>();
        nomes.colocar("João");
        nomes.colocar("Maria");

        retirarTodos(nomes);
    }

    private static void retirarTodos(Colecao<?> objetos) {
        try {
            int i = 1;
            while (true) {
                Object objeto = objetos.retirar();
                System.out.printf("%d. %s%n", i, objeto);
                i++;
            }
        } catch (ColecaoVaziaException e) {
            System.out.println("Coleção de objetos esgotada");
        }
    }

}