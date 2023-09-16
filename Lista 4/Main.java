import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a, b, c, d, e, f, g, h, i ,j,k;
        System.out.println("rua");
        a = input.nextLine();
        System.out.println("Numéro:");
        b = input.nextLine();
        System.out.println("Complemento");
        c = input.nextLine();
        System.out.println("Bairro");
        d = input.nextLine();
        System.out.println("Cidade");
        e = input.nextLine();
        System.out.println("UF");
        f = input.nextLine();
        System.out.println("CEP: ");
        g = input.nextLine();
        Endereco x = new Endereco(a, b, c, d, e, f, g);
        System.out.println("Codigo:");
        h= input.nextLine();
        System.out.println("nome:");
        i= input.nextLine();
        System.out.println("Sexo:");
        j= input.nextLine();
        System.out.println("Especialidade:");
        k= input.nextLine();
        Medico y = new Medico(h, i, j, k, x);
        System.out.println(y.toString());
        input.close();
    }
}
