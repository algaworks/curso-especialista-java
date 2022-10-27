public enum StatusNotaFiscal {

    NAO_EMITIDA("Não emitida") {
        @Override
        public boolean podeMudarParaCancelado(double valor) {
            return true;
        }

        @Override
        public boolean podeMudarParaEmitido(double valor) {
            return true;
        }
    },
    EMITIDA("Emitida") {
        @Override
        public boolean podeMudarParaCancelado(double valor) {
            return valor < 1_000;
        }

        @Override
        public boolean podeMudarParaEmitido(double valor) {
            return false;
        }
    },
    CANCELADA("Cancelada") {
        @Override
        public boolean podeMudarParaCancelado(double valor) {
            return false;
        }

        @Override
        public boolean podeMudarParaEmitido(double valor) {
            return false;
        }
    };

    private String descricao;

    StatusNotaFiscal(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public abstract boolean podeMudarParaCancelado(double valor);
    public abstract boolean podeMudarParaEmitido(double valor);

}
