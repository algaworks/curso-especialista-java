import java.util.Optional;

public class Cliente {

    private final String nome;
    private Endereco endereco;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public Optional<Endereco> getEndereco() {
        return Optional.ofNullable(endereco);
    }

}
