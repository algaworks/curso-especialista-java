public class Cliente {

    static final double TAXA_LIMITE_CREDITO = 0.10;
    static final double LIMITE_CREDITO_MINIMO = 10_000;

    String razaoSocial;
    double faturamentoAnual;

    double calcularLimiteCredito() {
        double limiteCredito = faturamentoAnual * TAXA_LIMITE_CREDITO;

        if (limiteCredito < LIMITE_CREDITO_MINIMO) {
            limiteCredito = LIMITE_CREDITO_MINIMO;
        }

        return limiteCredito;
    }

}
