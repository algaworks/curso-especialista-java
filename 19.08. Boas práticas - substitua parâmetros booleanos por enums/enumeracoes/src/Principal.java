public class Principal {

    public static void main(String[] args) {
        ServicoCancelamentoPedido servico = new ServicoCancelamentoPedido();

        Pedido pedido = new Pedido();
        pedido.setNomeCliente("João da Silva");
        pedido.setValorTotal(90);

//        servico.cancelar(pedido, true);
        servico.cancelar(pedido, TipoUsuario.CLIENTE);
    }

}
