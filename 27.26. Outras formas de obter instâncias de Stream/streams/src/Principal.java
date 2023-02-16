import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Principal {

    public static void main(String[] args) {
//        String[] nomes = { "Maria", "Sebastião", "João" };
//        Arrays.stream(nomes)
//                .map(String::toUpperCase)
//                .sorted()
//                .forEach(System.out::println);

//        Stream.iterate(new BigDecimal("1000"),
//                valor -> valor.compareTo(BigDecimal.ZERO) >= 0,
//                valor -> valor.subtract(new BigDecimal("10")))
//                .forEach(System.out::println);

//        Stream<Integer> stream = Stream.empty();

//        Stream.of(1, 2, 3)
//                .forEach(System.out::println);

//        int total = IntStream.of(1, 2, 3)
//                .sum();
//        System.out.println(total);

//        Stream<Integer> stream1 = Stream.of(1, 2, 3);
//        Stream<Integer> stream2 = Stream.of(9, 8, 7);
//        Stream.concat(stream1, stream2)
//                .forEach(System.out::println);

//        IntStream.range(1, 10)
//                .forEach(System.out::println);

//        IntStream.rangeClosed(1, 10)
//                .skip(5)
//                .forEach(System.out::println);

        Random random = new Random();
        Stream.generate(() -> random.nextInt(9) + 1)
                .distinct()
                .limit(6)
                .forEach(System.out::println);
    }

}
