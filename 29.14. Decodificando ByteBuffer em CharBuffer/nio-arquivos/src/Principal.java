import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        buffer.put((byte) 79);
        buffer.put((byte) 108);
        buffer.put((byte) -61);
        buffer.put((byte) -95);

        buffer.flip();

//        CharBuffer charBuffer = buffer.asCharBuffer();
        Charset charset = StandardCharsets.UTF_8;
        CharBuffer charBuffer = charset.decode(buffer);
        System.out.println(charBuffer);

//        System.out.println(Arrays.toString("Olá".getBytes(StandardCharsets.UTF_8)));
    }

}
