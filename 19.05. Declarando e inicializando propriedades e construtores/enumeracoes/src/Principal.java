public class Principal {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.setNomeCliente("João da Silva");
        pedido.setStatus(StatusPedido.SEPARADO);

        System.out.println(pedido.getTempoEntregaEmHoras());
    }

}
