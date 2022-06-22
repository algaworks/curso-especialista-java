public class Produto {

    static final int QUANTIDADE_ESTOQUE_INICIAL = 100;

    String nome;
    int quantidadeEstoque;

    Produto() {
        this.nome = "Sem nome";
        this.quantidadeEstoque = QUANTIDADE_ESTOQUE_INICIAL;
    }

    Produto(String nome) {
        this.nome = nome;
        this.quantidadeEstoque = QUANTIDADE_ESTOQUE_INICIAL;
    }

    Produto(String nome, int estoqueInicial) {
        this.nome = nome;
        this.quantidadeEstoque = estoqueInicial;
    }

}
