public class ExtracaoNome {

    public static void main(String[] args) {
        String nome = "João Silva Souza Magalhães";

//        System.out.println(nome.lastIndexOf(" "));
//        System.out.println(nome.substring(11));

        System.out.println(obterUltimoNome(nome));
    }

    private static String obterUltimoNome(String nome) {
        int posicaoUltimoEspaco = nome.lastIndexOf(" ");

        if (posicaoUltimoEspaco < 0) {
            throw new RuntimeException("Não é um nome completo");
        }

        return nome.substring(posicaoUltimoEspaco + 1);
    }

    private static String obterSobrenome(String nome) {
        int posicaoPrimeiroEspaco = nome.indexOf(" ");

        if (posicaoPrimeiroEspaco < 0) {
            throw new RuntimeException("Não é um nome completo");
        }

        return nome.substring(posicaoPrimeiroEspaco + 1);
    }

    private static String obterSegundoNome(String nome) {
        int posicaoPrimeiroEspaco = nome.indexOf(" ");
        int posicaoSegundoEspaco = nome.indexOf(" ", posicaoPrimeiroEspaco + 1);

        if (posicaoPrimeiroEspaco < 0) {
            throw new RuntimeException("Não é um nome completo");
        }

        return nome.substring(posicaoPrimeiroEspaco + 1,
                posicaoSegundoEspaco < 0 ? nome.length() : posicaoSegundoEspaco);
    }

}
