public class Calendario {

    static final String[] NOMES_MESES = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio",
        "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

    static String obterNomeMes(int numeroMes) {
        if (numeroMes < 1 || numeroMes > 12) {
            return null;
        }

        return NOMES_MESES[numeroMes - 1];
    }

}
