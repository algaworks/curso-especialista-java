import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Principal1 {

    public static void main(String[] args) {
        Predicate<String> predicate = str -> str.startsWith("T");
        boolean comecaComT = predicate.test("Thiago");
        System.out.println(comecaComT);

        Function<String, LocalDate> function = str -> LocalDate.parse(str);
        LocalDate data = function.apply("2023-09-13");
        System.out.println(data);

        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        LocalDateTime dataHora = supplier.get();
        System.out.println(dataHora);

        Consumer<String> consumer = str -> System.out.println(str);
        consumer.accept("Olá, mergulhador");
    }

}
