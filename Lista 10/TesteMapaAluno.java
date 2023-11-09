import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TesteMapaAluno {
    public static void main(String[] args) {
        Map<String, Aluno> mapaAluno = new HashMap<>();
        mapaAluno.put("12345", new Aluno(12, "Aluno1", 20, "Curso A"));
        // Adicionar mais alunos ao mapa...

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a matrícula do aluno: ");
            String matricula = scanner.nextLine();

            if (mapaAluno.containsKey(matricula)) {
                Aluno aluno = mapaAluno.get(matricula);
                System.out.println("Matricula: "+ aluno.getMatricula());
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("Idade: " + aluno.getIdade());
                System.out.println("Curso: " + aluno.getCurso());
            } else {
                System.out.println("Aluno não encontrado!");
            }
        }
    }
}