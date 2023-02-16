import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Produto;

import java.util.List;
import java.util.stream.IntStream;

public class Principal {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        IntStream stream = produtos.stream()
                .filter(Produto::temEstoque)
                .mapToInt(Produto::getQuantidade)
                .sorted();

        stream.forEach(num -> System.out.println(num * 2));
    }

}
