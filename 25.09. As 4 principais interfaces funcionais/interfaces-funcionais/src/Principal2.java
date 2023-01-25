import java.util.function.*;

public class Principal2 {

    public static void main(String[] args) {
        IntPredicate predicate = num -> num > 10;
        IntFunction<String> function = num -> "Número: " + num;
        IntSupplier supplier = () -> 10;
        IntConsumer consumer = num -> System.out.println("Número: " + num);
    }

}
