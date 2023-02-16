import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Produto;

import java.util.List;

public class Principal {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

//        int totalEstoque = produtos.stream()
//                .mapToInt(Produto::getQuantidade)
//                .sum();
////                .reduce(0, Integer::sum);
//        System.out.println(totalEstoque);

//        double mediaEstoque = produtos.stream()
//                .mapToInt(Produto::getQuantidade)
//                .average()
//                .orElseThrow(() -> new RuntimeException("Não há produtos para calcular a média"));
//        System.out.println(mediaEstoque);

        long totalProdutosComEstoque = produtos.stream()
                .filter(Produto::temEstoque)
                .count();
        System.out.println(totalProdutosComEstoque);
    }

}
