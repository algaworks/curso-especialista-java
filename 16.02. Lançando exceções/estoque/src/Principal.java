import com.algaworks.estoque.Produto;

public class Principal {

    public static void main(String[] args) {
        // Produto produto = new Produto(null);
        Produto produto = new Produto("Apple Watch");
        produto.adicionarEstoque(10);
        produto.ativar();

        produto.retirarEstoque(5);

        System.out.printf("Estoque: %d%n", produto.getQuantidadeEstoque());
    }

}
