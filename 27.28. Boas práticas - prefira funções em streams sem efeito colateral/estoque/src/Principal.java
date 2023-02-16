import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Fabricante;
import com.algaworks.estoque.Produto;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

//        List<Fabricante> fabricantes = new ArrayList<>();
//        produtos.stream()
//                .filter(Produto::temEstoque)
//                .forEach(produto -> {
//                    if (!fabricantes.contains(produto.getFabricante())) {
//                        fabricantes.add(produto.getFabricante());
//                    }
//                });
//
//        System.out.println(fabricantes);

        List<Fabricante> fabricantes = produtos.stream()
                .filter(Produto::temEstoque)
                .map(Produto::getFabricante)
                .distinct()
                .toList();
        System.out.println(fabricantes);
    }

}
