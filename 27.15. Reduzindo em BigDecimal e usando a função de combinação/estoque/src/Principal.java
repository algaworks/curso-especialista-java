import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Produto;

import java.math.BigDecimal;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

//        BigDecimal valorEmEstoque = produtos.stream()
//                .map(produto -> produto.getPreco()
//                        .multiply(new BigDecimal(produto.getQuantidade())))
//                .reduce(BigDecimal.ZERO, BigDecimal::add);
//
//        System.out.println(valorEmEstoque);
        
        BigDecimal valorEmEstoque = produtos.stream()
                .reduce(BigDecimal.ZERO, (subtotal, produto) -> {
                    BigDecimal valorEstoqueProduto = produto.getPreco()
                            .multiply(new BigDecimal(produto.getQuantidade()));
                    return subtotal.add(valorEstoqueProduto);
                }, BigDecimal::add);

        System.out.println(valorEmEstoque);
    }

}
