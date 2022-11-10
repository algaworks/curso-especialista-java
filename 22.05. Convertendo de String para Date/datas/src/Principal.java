import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {

    public static void main(String[] args) throws ParseException {
        String dataTexto = "30/12/2023 10:20:45";
        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date data = formatador.parse(dataTexto);
        System.out.println(data);
    }

}
