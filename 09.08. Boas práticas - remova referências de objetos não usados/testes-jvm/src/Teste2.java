public class Teste2 {

    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        pilha.imprimirEstatisticas();

        pilha.adicionar(new Cliente());
        pilha.adicionar(new Cliente());
        pilha.adicionar(new Cliente());
        pilha.adicionar(new Cliente());
        pilha.adicionar(new Cliente());
        pilha.adicionar(new Cliente());

        Cliente clienteRetirado = null;

        do {
            clienteRetirado = pilha.retirar();
            pilha.imprimirEstatisticas();
        } while (clienteRetirado != null);

        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        Cliente c3 = new Cliente();
    }

}