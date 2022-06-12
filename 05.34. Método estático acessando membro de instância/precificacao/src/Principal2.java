public class Principal2 {

    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        Produto.alterarCustoEmbalagem(12);

        Produto.imprimirCustoEmbalagem();
    }

}
