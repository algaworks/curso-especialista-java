import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Produto;

import java.util.List;

public class Principal {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        produtos.stream()
                .filter(Produto::temEstoque)
                .map(Produto::getFabricante)
                .distinct()
                .forEach(System.out::println);
    }

}
