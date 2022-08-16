import com.algaworks.seguradora.modelo.Caminhao;
import com.algaworks.seguradora.modelo.CarroParticular;
import com.algaworks.seguradora.modelo.ImovelResidencial;
import com.algaworks.seguradora.servico.ServicoPropostaSeguro;

public class Principal {

    public static void main(String[] args) {
        ServicoPropostaSeguro servicoPropostaSeguro = new ServicoPropostaSeguro();

        CarroParticular carro = new CarroParticular("HR-V", 2022, 150_000);
        Caminhao caminhao = new Caminhao("Actros", 2021, 780_000, 4);
        ImovelResidencial imovel = new ImovelResidencial(2_300_000, 320);

        servicoPropostaSeguro.emitir(carro);
        servicoPropostaSeguro.emitir(caminhao);
        servicoPropostaSeguro.emitir(imovel);
    }

}
