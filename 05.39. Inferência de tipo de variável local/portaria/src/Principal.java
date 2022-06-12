public class Principal {

    public static void main(String[] args) {
        var novoVisitante = new Visitante();

        novoVisitante.nome = "João";
        novoVisitante.idade = 15;

        var cadastroPortaria = new CadastroPortaria();
//        var codigoVisitante = cadastroPortaria.cadastrar(novoVisitante, 2);
        int codigoVisitante = cadastroPortaria.cadastrar(novoVisitante, 2);
    }

}
