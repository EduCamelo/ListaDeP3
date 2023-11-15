import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] x = new int[10];
        for (int i = 0; i < x.length; i++) {
            x[i] = input.nextInt(); 
        }
        int y = input.nextInt();

        try {
            System.out.println(x[y]);
        } catch (Exception e) {
            System.out.println("Valor inválido!");
        }
        input.close();
    }
}
