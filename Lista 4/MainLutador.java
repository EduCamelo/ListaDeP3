import java.util.Scanner;

public class MainLutador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Street fight");
        Lutador x = new Lutador("Ryu", 100, 10);
        Lutador y = new Lutador("Bison", 100, 12);
        for(int i =0; i<3; i++){
        x.reduzirEnergia(y);
        }
        System.out.println(y.getEnergia());
        for(int i =0; i<8; i++){
            y.reduzirEnergia(x);
        }
        System.out.println(x.getEnergia());
        input.close();
    }
}
