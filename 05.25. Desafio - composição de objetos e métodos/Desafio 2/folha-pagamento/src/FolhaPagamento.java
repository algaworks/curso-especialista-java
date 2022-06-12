public class FolhaPagamento {

    double calcularSalario(int horasNormais, int horasExtras, ContratoTrabalho contrato) {
        double valorHorasNormais = horasNormais * contrato.valorHoraNormal;
        double valorHorasExtras = horasExtras * contrato.valorHoraExtra;

        double valorTotal = valorHorasNormais + valorHorasExtras;

        if (contrato.possuiAdicionalParaFilhos()) {
            valorTotal *= 1.10;
        }

        return valorTotal;
    }

}
