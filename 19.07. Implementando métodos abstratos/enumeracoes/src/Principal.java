public class Principal {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.setNomeCliente("João da Silva");
        pedido.setValorTotal(120);
        pedido.setStatus(StatusPedido.EM_ANALISE);
        pedido.cancelar();

        System.out.println(pedido.getStatus());
    }

}
