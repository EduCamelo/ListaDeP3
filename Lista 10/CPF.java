import java.util.HashSet;
import java.util.Scanner;

public class CPF {
    public static void main(String[] args) {
        HashSet<String> cpfSet = new HashSet<>();
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < 10; i++) {
                System.out.print("Digite um CPF: ");
                String cpf = scanner.nextLine();
                cpfSet.add(cpf);
            }
        }

        System.out.println("CPFs no conjunto:");
        for (String cpf : cpfSet) {
            System.out.println(cpf);
        }
    }
}
