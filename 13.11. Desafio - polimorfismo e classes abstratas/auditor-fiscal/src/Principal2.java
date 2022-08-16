import com.algaworks.impostos.EmpresaLucroReal;
import com.algaworks.impostos.EmpresaSimples;
import com.algaworks.impostos.GestorDeImpostos;
import com.algaworks.impostos.PessoaFisica;

public class Principal2 {

    public static void main(String[] args) {
        var gestorImpostos = new GestorDeImpostos();

        var joao = new PessoaFisica("João da Silva", 45_000);
        var maria = new PessoaFisica("Maria Souza", 180_000);

        var barDoZe = new EmpresaSimples("Bar do Zé", 250_000, 160_000);
        var codeConsultoria = new EmpresaLucroReal("Code Consultoria", 8_000_000, 6_000_000);

        gestorImpostos.adicionar(joao);
        gestorImpostos.adicionar(maria);
        gestorImpostos.adicionar(barDoZe);
        gestorImpostos.adicionar(codeConsultoria);

        System.out.printf("Total de impostos: %.2f", gestorImpostos.getValorTotalImpostos());
    }

}
