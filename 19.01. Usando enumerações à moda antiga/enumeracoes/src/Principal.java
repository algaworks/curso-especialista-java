public class Principal {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.setNomeCliente("João da Silva");
        pedido.setStatus(Pedido.STATUS_ENTREGUE);
        pedido.setOrigem(Pedido.ORIGEM_BALCAO);

        System.out.println(Pedido.getDescricaoStatus(pedido.getStatus()));

    }

}
