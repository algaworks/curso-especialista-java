public class NumeroUtil {

    static int descobrirMaior(int a, int b) {
        return a > b ? a : b;
    }

    static int descobrirMaior(int a, int b, int c) {
        return descobrirMaior(descobrirMaior(a, b), c);
    }

    static double descobrirMaior(double a, double b) {
        return a > b ? a : b;
    }

    static double descobrirMaior(double a, double b, double c) {
        return descobrirMaior(descobrirMaior(a, b), c);
    }

}
