import java.util.Calendar;

public class Principal {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
//        calendar.set(Calendar.DAY_OF_MONTH, 20);

//        calendar.set(Calendar.MONTH, Calendar.DECEMBER);
        calendar.add(Calendar.MONTH, 3);
//        calendar.add(Calendar.MONTH, -3);

        int ultimoDiaDoMes = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        calendar.set(Calendar.DAY_OF_MONTH, ultimoDiaDoMes);

        System.out.println(calendar.getTime());
    }

}
