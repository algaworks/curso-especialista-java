import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Produto;

import java.util.List;
import java.util.stream.IntStream;

public class Principal2 {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        int maximoEstoque = 0;
        for (Produto produto : produtos) {
            if (produto.getQuantidade() > maximoEstoque) {
                maximoEstoque = produto.getQuantidade();
            }
        }

        System.out.println(maximoEstoque);
    }

}
