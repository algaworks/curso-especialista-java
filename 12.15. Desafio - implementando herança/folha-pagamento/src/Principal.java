import com.algaworks.rh.Funcionario;
import com.algaworks.rh.Holerite;
import com.algaworks.rh.Programador;

public class Principal {

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João", 40);
        System.out.println(funcionario1);
        Holerite holerite1 = funcionario1.gerarHolerite(180, "jul/2022");
        holerite1.imprimir();

        System.out.println();

        Programador programador1 = new Programador("Maria", 80);
        programador1.setValorBonus(1000);
        System.out.println(programador1);
        Holerite holerite2 = programador1.gerarHolerite(180, "jul/2022");
        holerite2.imprimir();
    }

}
