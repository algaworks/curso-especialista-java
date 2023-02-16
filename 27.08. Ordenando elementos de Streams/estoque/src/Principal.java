import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Produto;

import java.util.Comparator;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        produtos.stream()
                .filter(Produto::temEstoque)
                .sorted(Comparator.comparingInt(Produto::getQuantidade))
                .forEach(produto -> System.out.printf("%s = %d unidades%n",
                        produto.getNome(), produto.getQuantidade()));
    }

}
