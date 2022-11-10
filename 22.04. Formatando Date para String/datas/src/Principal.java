import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Principal {

    public static void main(String[] args) {
        Date hoje = new Date();

//        DateFormat formatador = DateFormat.getDateInstance();
//        DateFormat formatador = DateFormat.getDateTimeInstance();
//        DateFormat formatador = DateFormat.getTimeInstance();
//        DateFormat formatador = DateFormat.getDateTimeInstance(
//                DateFormat.FULL, DateFormat.FULL, new Locale("pt", "BR"));

        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println(formatador.format(hoje));
    }

}
