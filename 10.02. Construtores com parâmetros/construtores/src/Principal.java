public class Principal {

    public static void main(String[] args) {
        Produto produto1 = new Produto("Picanha 1kg (peça)");

        System.out.println(produto1.nome);
        System.out.println(produto1.quantidadeEstoque);
    }

}
