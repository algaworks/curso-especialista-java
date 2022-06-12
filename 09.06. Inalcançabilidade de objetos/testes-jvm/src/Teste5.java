public class Teste5 {

    public static void main(String[] args) {
        imprimirUsoMemoria();

        Cliente cliente = new Cliente();
        Endereco endereco = new Endereco();

        cliente.endereco = endereco;
        endereco.cliente = cliente;

        cliente = null;
        endereco = null;

        imprimirUsoMemoria();

        System.gc();

        imprimirUsoMemoria();
    }

    static void imprimirUsoMemoria() {
        System.out.printf("Máxima: %s%n",
                emMegabytes(Runtime.getRuntime().maxMemory()));

        System.out.printf("Total empenhada: %s%n",
                emMegabytes(Runtime.getRuntime().totalMemory()));

        System.out.printf("Disponível: %s%n",
                emMegabytes(Runtime.getRuntime().freeMemory()));

        long memoriaUsada = Runtime.getRuntime().totalMemory()
                - Runtime.getRuntime().freeMemory();
        System.out.printf("Usada: %s%n", emMegabytes(memoriaUsada));

        System.out.println("---");
    }

    static String emMegabytes(long bytes) {
        return String.format("%.2fMB", bytes / 1024d / 1024d);
    }

}
