public class Principal {

    public static void main(String[] args) {
        ServicoCadastroAnuncio servicoCadastroAnuncio = new ServicoCadastroAnuncio();
        servicoCadastroAnuncio.cadastrar("999", "Teste");

        System.out.println("Anúncio cadastrado");
    }

}