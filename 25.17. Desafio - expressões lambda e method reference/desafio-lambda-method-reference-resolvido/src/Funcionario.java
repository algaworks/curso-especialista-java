import java.math.BigDecimal;

public class Funcionario {

    private final String nome;
    private final BigDecimal salario;
    private final boolean ativo;

    public Funcionario(String nome, BigDecimal salario, boolean ativo) {
        this.nome = nome;
        this.salario = salario;
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public boolean isInativo() {
        return !isAtivo();
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", ativo=" + ativo +
                '}';
    }
    
}