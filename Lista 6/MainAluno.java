import java.util.ArrayList;
import java.util.Scanner;

public class MainAluno {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();// Criando a lista de alunos
        Aluno x = new Aluno("Edu", 100);// Criando o aluno
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {// Complicando o negocio por 0 motivos
            System.out.println("Digite a nota " + (i + 1) + "° para o " + (alunos.size() + 1) + "° aluno:");
            double nota = input.nextDouble();
            x.setNotas(nota);
        }

        alunos.add(x);// Adiciona a lista de alunos

        for (Aluno aluno : alunos) {// Obs: não precisa escrever o foreach completamente, pois ele autocompleta
            if (aluno.calcularMedia() >= 7) {// Comparação
                System.out.println(aluno.toString() + "aprovado");
            } else {// Comparação
                System.out.println(aluno.toString() + "reprovado");
            }
        }
        input.close();
    }
}
