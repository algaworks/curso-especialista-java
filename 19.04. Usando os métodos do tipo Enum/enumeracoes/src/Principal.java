public class Principal {

    public static void main(String[] args) {
//        System.out.println(StatusPedido.EMITIDO.ordinal());
//        System.out.println(StatusPedido.EMITIDO.name());

//        for (StatusPedido status : StatusPedido.values()) {
//            System.out.printf("%d - %s%n", status.ordinal(), status.name());
//        }

//        String textoStatus = "CANCELADO";
//        StatusPedido status = StatusPedido.valueOf(textoStatus);
//        System.out.println(status.ordinal() + " - " + status.name());

        int numero = 1;
        StatusPedido status = StatusPedido.values()[numero];
        System.out.println(status.ordinal() + " - " + status.name());
    }

}
