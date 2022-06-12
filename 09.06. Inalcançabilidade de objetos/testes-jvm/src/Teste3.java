public class Teste3 {

    public static void main(String[] args) {
        imprimirUsoMemoria();

        criarObjeto();

        imprimirUsoMemoria();

        System.gc();

        imprimirUsoMemoria();
    }

    static void criarObjeto() {
        byte[] x = new byte[500 * 1024 * 1024];
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
