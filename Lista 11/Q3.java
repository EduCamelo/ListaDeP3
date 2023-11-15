import java.util.InputMismatchException;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextInt();
        double y = input.nextInt();

        try {
            System.out.println(x/y);
        } catch (ArithmeticException e) {
            System.out.println("Valor não pode ser dividido por 0!");
        }catch(InputMismatchException e){
            System.out.println("Erro! Valores devem ser numericos.");
        }
        input.close();
    }
}
