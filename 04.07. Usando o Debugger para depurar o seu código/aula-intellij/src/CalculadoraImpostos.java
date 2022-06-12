public class CalculadoraImpostos {

    public static void main(String[] args) {
        char tipoNotaFiscal = 'S';
        double totalFaturado = 1200.30;

        double taxaImpostos;

        if (tipoNotaFiscal == 'S') {
            taxaImpostos = 0.16;
        } else {
            taxaImpostos = 0.35;
        }

        double valorImpostos = totalFaturado * taxaImpostos;

        System.out.printf("Total faturado: R$%.2f%n", totalFaturado);
        System.out.printf("Valor dos impostos: R$%.2f%n", valorImpostos);
    }

}