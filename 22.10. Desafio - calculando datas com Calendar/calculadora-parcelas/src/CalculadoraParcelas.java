import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class CalculadoraParcelas {

    public static List<Date> calcular(Date dataPrimeiraParcela, int quantidadeParcelas) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataPrimeiraParcela);

        limparHora(calendar);

        int diaVencimentoPrimeiraParcela = calendar.get(Calendar.DAY_OF_MONTH);

        List<Date> datasParcelas = new ArrayList<>();
        datasParcelas.add(calendar.getTime());

        for (int i = 2; i <= quantidadeParcelas; i++) {
            calendar.add(Calendar.MONTH, 1);

            int diaDoMesMaximo = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
            int diaVencimentoParcelaAtual = calendar.get(Calendar.DAY_OF_MONTH);

            if (diaVencimentoParcelaAtual < diaVencimentoPrimeiraParcela
                    && diaVencimentoPrimeiraParcela <= diaDoMesMaximo) {
                calendar.set(Calendar.DAY_OF_MONTH, diaVencimentoPrimeiraParcela);
            }

            datasParcelas.add(calendar.getTime());
        }

        return datasParcelas;
    }

    private static void limparHora(Calendar calendar) {
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
    }

}