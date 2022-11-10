import java.util.Date;

public class Principal {

    public static void main(String[] args) {
//        System.out.println(System.currentTimeMillis());

//        Date data = new Date();
        Date data = new Date(System.currentTimeMillis() - (24 * 60 * 60 * 1000));
        System.out.println(data);

//        System.out.println(data.getMonth());
//        System.out.println(data.getYear());
    }

}
