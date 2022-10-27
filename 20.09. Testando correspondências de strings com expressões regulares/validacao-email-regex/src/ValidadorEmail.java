public class ValidadorEmail {

    public static boolean validar(String email) {
        return email.matches("[\\w.-]+@[a-z\\d.-]+\\.[a-z]{2,3}");
    }

}
