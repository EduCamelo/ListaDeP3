import java.util.Scanner;

public class Q1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String x = input.next();
        int y = input.nextInt();

        try {
            System.out.println(x.charAt(y));
        } catch (Exception e) {
            System.out.println("Valor inválido! ");
        }
        input.close();
    }
}