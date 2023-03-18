import java.nio.CharBuffer;
import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {
        CharBuffer charBuffer = CharBuffer.allocate(1000);
        charBuffer.put('O');
        charBuffer.put('l');
        charBuffer.put('a');

        charBuffer.flip();
        charBuffer.chars()
                .forEach(c -> System.out.print((char) c));

//        System.out.println(charBuffer);
//        System.out.println(Arrays.toString(charBuffer.array()));
    }

}
