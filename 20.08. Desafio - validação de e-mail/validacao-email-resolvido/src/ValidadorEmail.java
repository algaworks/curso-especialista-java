import java.util.Arrays;
import java.util.List;

public class ValidadorEmail {

    public static boolean validar(String email) {
        int posicaoArroba = email.indexOf("@");
        int posicaoSufixo = email.lastIndexOf(".");

        if (posicaoArroba == -1) return false;
        if (posicaoSufixo <= posicaoArroba) return false;

        String nomeUsuario = email.substring(0, posicaoArroba);
        String nomeDominio = email.substring(posicaoArroba + 1, posicaoSufixo);
        String sufixoDominio = email.substring(posicaoSufixo + 1);

        if (!validarNomeUsuario(nomeUsuario)) return false;
        if (!validarNomeDominio(nomeDominio)) return false;

        return validarSufixoDominio(sufixoDominio);
    }

    private static boolean validarNomeUsuario(String nomeUsuario) {
        if (nomeUsuario.isEmpty()) return false;

        return validarCaracteresEmParteDoEmail(nomeUsuario, true,
                true, '_', '-', '.');
    }

    private static boolean validarNomeDominio(String nomeDominio) {
        if (nomeDominio.isEmpty()) return false;

        return validarCaracteresEmParteDoEmail(nomeDominio, false,
                true, '-', '.');
    }

    private static boolean validarSufixoDominio(String sufixoDominio) {
        if (sufixoDominio.length() != 2 && sufixoDominio.length() != 3) return false;

        return validarCaracteresEmParteDoEmail(sufixoDominio, false, false);
    }

    private static boolean validarCaracteresEmParteDoEmail(String parte, boolean aceitaMaiusculos,
                                                           boolean aceitaDigitos, Character... caracteresExtrasAceitos) {
        for (int i = 0; i < parte.length(); i++) {
            char caractere = parte.charAt(i);
            if (!validarCaractere(caractere, aceitaMaiusculos, aceitaDigitos, caracteresExtrasAceitos)) {
                return false;
            }
        }

        return true;
    }

    private static boolean validarCaractere(Character caractere, boolean aceitaMaiusculo,
                                            boolean aceitaDigito, Character... caracteresExtrasAceitos) {
        List<Character> caracteresExtras = Arrays.asList(caracteresExtrasAceitos);

        return (Character.isLetter(caractere) && (aceitaMaiusculo || Character.isLowerCase(caractere)))
                || (aceitaDigito && Character.isDigit(caractere))
                || caracteresExtras.contains(caractere);
    }

}
