import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("");
            double metros = input.nextDouble();
            
            double cm = metros * 100;
            double mm = metros * 1000;
            double km = metros / 1000;
            
            System.out.println("Valor em centímetros: " + cm);
            System.out.println("Valor em milímetros: " + mm);
            System.out.println("Valor em quilômetros: " + km);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: valor inválido");
        }
        input.close();
    }
}