import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Categoria;
import com.algaworks.estoque.Produto;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Principal2 {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        Set<Categoria> categorias = new HashSet<>();
        for (Produto produto : produtos) {
            if (produto.temEstoque()) {
                categorias.addAll(produto.getCategorias());
            }
        }

        for (Categoria categoria : categorias) {
            System.out.println(categoria);
        }
    }

}
