import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Produto;

import java.util.List;
import java.util.function.IntBinaryOperator;

public class Principal {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

//        IntBinaryOperator operacaoSoma = (subtotal, valor) -> subtotal + valor;
//        int totalEstoque = produtos.stream()
//                .mapToInt(Produto::getQuantidade)
//                .reduce(0, operacaoSoma);
//        System.out.println(totalEstoque);

//        int totalEstoque = produtos.stream()
//                .mapToInt(Produto::getQuantidade)
//                .reduce(0, Integer::sum);
//        System.out.println(totalEstoque);

        int maximoEstoque = produtos.stream()
                .mapToInt(Produto::getQuantidade)
                .reduce(0, Integer::max);
        System.out.println(maximoEstoque);
    }

}
