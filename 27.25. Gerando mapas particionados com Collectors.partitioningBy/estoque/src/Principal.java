import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Produto;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Principal {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        Map<Boolean, List<Produto>> estoqueProdutos = produtos.stream()
                .collect(Collectors.partitioningBy(Produto::temEstoque));

        estoqueProdutos.forEach((chave, valor) -> {
            System.out.println();
            System.out.println(chave);
            System.out.println("--------");
            valor.forEach(System.out::println);
        });
    }

}
