
import java.util.InputMismatchException;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] x = new int[10];
        int i = 0;
        try {

            while (true) {
                x[i] = input.nextInt();
                i++;
                if(x[i-1] == 0){
                    break;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Passou da quantidade máxima de valores permitidos no vetor");
        } catch (InputMismatchException e) {
            System.out.println("Erro! Valores devem ser numericos.");
        }
        input.close();
    }
}
