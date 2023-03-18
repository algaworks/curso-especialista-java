import java.nio.ByteBuffer;
import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(1024); // 1 kb
//        System.out.println(buffer.position());

        System.out.println(buffer.limit());
        buffer.put((byte) 10);
        buffer.put((byte) 20);

//        buffer.flip();
        buffer.clear();
        System.out.println(buffer.limit());

        buffer.put((byte) 30);
        buffer.put((byte) 40);

        buffer.put((byte) 50);

        System.out.println(Arrays.toString(buffer.array()));
    }

}
