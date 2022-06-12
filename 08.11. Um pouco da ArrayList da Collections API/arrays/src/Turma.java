import java.util.ArrayList;

public class Turma {

    String identificacao;
    String nomeProfessora;
    ArrayList<Aluno> alunos = new ArrayList<>();

    void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    void removerAluno(int indice) {
        alunos.remove(indice);
    }

    void imprimirListaDeAlunos() {
        for (Aluno aluno : alunos) {
            System.out.printf("%s (%d anos)%n", aluno.nome, aluno.idade);
        }
    }

}
