import com.algaworks.estoque.Produto;

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
            } catch (IllegalArgumentException iae) {
//                iae.printStackTrace(System.out);
                iae.printStackTrace();
                System.out.println("Erro na compra: " + iae.getMessage());
            }
        } while (true);
    }

    private static void efetuarBaixaEstoque(Produto produto, int quantidade) {
//        try {
            produto.retirarEstoque(quantidade);
            System.out.printf("%d unidades retiradas do estoque. Estoque atual: %d%n",
                    quantidade, produto.getQuantidadeEstoque());
//        } catch (IllegalArgumentException iae) {
//            System.out.println("Erro ao efetuar baixa no estoque: " + iae.getMessage());
//            throw iae;
//        }
    }

}
