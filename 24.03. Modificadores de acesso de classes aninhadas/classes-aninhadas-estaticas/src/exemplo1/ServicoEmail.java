package exemplo1;

public class ServicoEmail {

    public void enviar(Mensagem mensagem) {
        System.out.printf("Enviando de %s para %s: %s%n",
                mensagem.remetente, mensagem.getDestinatario(), mensagem.getTexto());
    }

    private static String gerarAssinatura() {
        return "\n--\nAlgaWorks";
    }

//    private static class Mensagem {
    public static class Mensagem {

        private final String remetente;
        private final String destinatario;
        private final String texto;

        public Mensagem(String remetente, String destinatario, String texto) {
            this.remetente = remetente;
            this.destinatario = destinatario;
            this.texto = texto;
        }

        public String getRemetente() {
            return remetente;
        }

        public String getDestinatario() {
            return destinatario;
        }

        public String getTexto() {
            return texto + gerarAssinatura();
        }

    }

}