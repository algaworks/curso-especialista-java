public class TesteReferencias {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "João";

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Maria";

        Carro meuCarro = new Carro();
        meuCarro.modelo = "HR-V";

        Carro seuCarro = new Carro();
        seuCarro.modelo = "X6";

        meuCarro.proprietario = pessoa1;
//        seuCarro.proprietario = pessoa1;
        seuCarro.proprietario = pessoa2;

        meuCarro.proprietario.nome = "Sebastião";

        System.out.println(meuCarro.proprietario.nome);
        System.out.println(seuCarro.proprietario.nome);

//        meuCarro.proprietario.nome = "Maria";
//        System.out.println(pessoa1.nome);

//        pessoa1.nome = "Maria";
//        System.out.println(meuCarro.proprietario.nome);
    }

}
