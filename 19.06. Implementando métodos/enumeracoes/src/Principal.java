public class Principal {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.setNomeCliente("João da Silva");
        pedido.setValorTotal(120);
//        pedido.emitir();
        pedido.cancelar();

        System.out.println(pedido.getStatus());
    }

}
