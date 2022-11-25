import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CalculadoraParcelas {

    public List<LocalDate> calcular(LocalDate dataPrimeiraParcela, int quantidadeParcelas) {
        List<LocalDate> datasParcelas = new ArrayList<>();

        for (int numeroParcela = 1; numeroParcela <= quantidadeParcelas; numeroParcela++) {
            LocalDate dataProximaParcela = dataPrimeiraParcela.plusMonths(numeroParcela - 1);
            datasParcelas.add(dataProximaParcela);
        }

        return datasParcelas;
    }

}