import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Principal {

    public static void main(String[] args) throws ParseException {
        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

//        Calendar calendar = Calendar.getInstance();
        Calendar calendar = new GregorianCalendar(1981, Calendar.SEPTEMBER, 13, 20, 35);
        Date data = calendar.getTime();

        System.out.println(formatador.format(data));
    }

}
