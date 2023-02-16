import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Produto;

import java.util.List;
import java.util.stream.Stream;

public class Principal {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        produtos.stream()
                .peek(produto -> produto.setNome(produto.getNome().toUpperCase()))
                .peek(p -> System.out.println("Antes do temEstoque: " + p))
                .filter(Produto::temEstoque)
                .peek(p -> System.out.println("Depois do temEstoque: " + p))
                .filter(Produto::isInativo)
                .forEach(produto -> {
                    System.out.println("Ativando " + produto);
                    produto.ativar();
                });
    }

}
