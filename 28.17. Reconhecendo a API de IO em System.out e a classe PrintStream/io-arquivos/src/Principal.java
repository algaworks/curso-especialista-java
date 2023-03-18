import java.io.*;

public class Principal {

    public static void main(String[] args) throws IOException {
        String nome = "Thiago";
//        OutputStream out = System.out;
//        out.write("Thiago".getBytes());

//        PrintStream out = System.out;
        PrintStream out = new PrintStream(
                new FileOutputStream(new File("docs/arquivo.txt")));
        out.printf("Olá, %s %n", nome);
    }

}
