import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Principal {

    public static void main(String[] args) {
        try (Connection conexao = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/comercial", "root", "")) {
            System.out.println("Conexão aberta!");

            System.out.println(conexao.getClass());
        } catch (SQLException e) {
            System.out.println("Erro de banco de dados");
            e.printStackTrace();
        }
    }

}
