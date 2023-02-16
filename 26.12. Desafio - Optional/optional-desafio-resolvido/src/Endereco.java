import java.util.Optional;

public class Endereco {

    private final String logradouro;
    private final String numero;
    private final String bairro;
    private Cidade cidade;
    private boolean residenciaPropria;

    public Endereco(String logradouro, String numero, String bairro) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
    }

    public Endereco(String logradouro, String numero, String bairro, Cidade cidade) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public boolean isResidenciaPropria() {
        return residenciaPropria;
    }

    public void setResidenciaPropria(boolean residenciaPropria) {
        this.residenciaPropria = residenciaPropria;
    }

    public Optional<Cidade> getCidade() {
        return Optional.ofNullable(cidade);
    }

}
