import com.algaworks.estoque.*;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Produto produto = new Produto("Apple Watch");
        produto.ativar();
        produto.adicionarEstoque(20);

        comprar(produto);
    }

    private static void comprar(Produto produto) {
        Scanner scanner = new Scanner(System.in);

        do {
            try {
                System.out.print("Quantidade: ");
                int quantidade = scanner.nextInt();

                efetuarBaixaEstoque(produto, quantidade);
                System.out.println("Compra realizada");

                break;
            } catch (BaixaEstoqueException e) {
                System.out.println("Erro na compra: " + e.getCause().getMessage());
//                e.printStackTrace();
            }
        } while (true);
    }

    private static void efetuarBaixaEstoque(Produto produto, int quantidade)
            throws BaixaEstoqueException {
        try {
            produto.retirarEstoque(quantidade);
            System.out.printf("%d unidades retiradas do estoque. Estoque atual: %d%n",
                    quantidade, produto.getQuantidadeEstoque());
        } catch (IllegalArgumentException e) {
            throw new BaixaEstoqueException("Erro ao realizar baixa no estoque", e);
        } catch (ProdutoException e) {
            throw new BaixaEstoqueException("Erro ao realizar baixa no estoque", e);
        }
    }

}
