import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Produto;

import java.util.List;
import java.util.Optional;

public class Principal {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        Optional<Produto> produtoOptional = produtos.stream()
                .peek(System.out::println)
                .filter(Produto::temEstoque)
                .filter(Produto::isInativo)
                .findFirst();
//                .findAny();

        System.out.println("-------");

        Produto produto = produtoOptional.orElseThrow(
                () -> new RuntimeException("Produto não encontrado"));
        System.out.println(produto);
    }

}
