import java.util.Objects;

public class Produto {

    static final int QUANTIDADE_ESTOQUE_INICIAL = 100;

    String nome;
    int quantidadeEstoque;

    Produto() {
        this.nome = "Sem nome";
        this.quantidadeEstoque = QUANTIDADE_ESTOQUE_INICIAL;
    }

    Produto(String nome) {
        Objects.requireNonNull(nome, "Nome é obrigatório");

        this.nome = nome;
        this.quantidadeEstoque = QUANTIDADE_ESTOQUE_INICIAL;
    }

    Produto(String nome, int estoqueInicial) {
        Objects.requireNonNull(nome, "Nome é obrigatório");

        if (estoqueInicial < 0) {
            throw new IllegalArgumentException("Estoque inicial não pode ser negativo");
        }

        this.nome = nome;
        this.quantidadeEstoque = estoqueInicial;
    }

}
