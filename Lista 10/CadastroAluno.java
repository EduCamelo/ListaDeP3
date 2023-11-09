import java.util.List;
import java.util.ArrayList;
public class CadastroAluno {
    private List<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void imprimirAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println("Matrícula: " + aluno.getMatricula() +
                    ", Nome: " + aluno.getNome() +
                    ", Idade: " + aluno.getIdade() +
                    ", Curso: " + aluno.getCurso());
        }
    }
}