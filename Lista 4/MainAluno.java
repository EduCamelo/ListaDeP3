import java.util.Scanner;

public class MainAluno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Aluno x = new Aluno("Edu", "111-222-333-99");
        int notas[] = new int[4];
        System.out.println("Primeira nota");
        notas[0] = input.nextInt();
        System.out.println("Segunda nota");
        notas[1] = input.nextInt();
        System.out.println("Terceira nota");
        notas[2] = input.nextInt();
        System.out.println("Quarta nota");
        notas[3] = input.nextInt();
        x.setNota(notas);
        System.out.println(x.calcularMedia());
        System.out.println("Segunda nota");
        System.out.println("Segunda nota");
        notas[1] = input.nextInt();
        x.setNota(notas);
        System.out.println(x.calcularMedia());

    }
}
