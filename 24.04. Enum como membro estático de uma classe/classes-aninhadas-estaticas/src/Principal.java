public class Principal {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("João", 41);
        cliente.setStatus(Cliente.Status.BLOQUEADO);
    }

}