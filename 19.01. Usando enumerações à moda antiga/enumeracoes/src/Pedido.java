public class Pedido {

    public static final int STATUS_RASCUNHO = 0;
    public static final int STATUS_EMITIDO = 1;
    public static final int STATUS_FATURADO = 2;
    public static final int STATUS_DESPACHADO = 3;
    public static final int STATUS_ENTREGUE = 4;
    public static final int STATUS_CANCELADO = 5;

    public static final int ORIGEM_BALCAO = 100;
    public static final int ORIGEM_ONLINE = 101;

    private String nomeCliente;
    private int status = STATUS_RASCUNHO;
    private int origem = ORIGEM_BALCAO;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        if (status < STATUS_RASCUNHO || status > STATUS_CANCELADO) {
            throw new IllegalArgumentException("Status inválido");
        }
        this.status = status;
    }

    public int getOrigem() {
        return origem;
    }

    public void setOrigem(int origem) {
        if (origem < ORIGEM_BALCAO || origem > ORIGEM_ONLINE) {
            throw new IllegalArgumentException("Origem inválida");
        }
        this.origem = origem;
    }

    public static String getDescricaoStatus(int status) {
        return switch (status) {
            case STATUS_RASCUNHO -> "Rascunho";
            case STATUS_EMITIDO -> "Emitido";
            case STATUS_FATURADO -> "Faturado";
            case STATUS_DESPACHADO -> "Despachado";
            case STATUS_ENTREGUE -> "Entregue";
            case STATUS_CANCELADO -> "Cancelado";
            default -> throw new IllegalArgumentException("Status inválido");
        };
    }

}
