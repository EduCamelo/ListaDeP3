import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite sua cidade: ");
        String cidade = input.next();
        if(cidade.toLowerCase().charAt(0) != 's'){
            System.out.println("Sua cidade não começa com S");
        }
        else{
            System.out.println("Sua cidade começa com S");
        }
        input.close();
    }
}
