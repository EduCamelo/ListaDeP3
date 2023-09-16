import java.util.Random;

public class MainFuncionario {
    public static void main(String[] args) throws Exception {
        Funcionario x[] = new Funcionario[50];
        Random y = new Random();
        for (int i = 0; i < x.length; i++) {
            String a = Integer.toString(i);
            x[i] = new Funcionario(a, y.nextDouble(10000, 100000), y.nextInt(18, 50));
        }
        for (int i = 0; i < x.length; i++) {
            if (x[i].getIdade() >= 30 && x[i].getSalarioAnual() >= 50000) {
                System.out.println(x[i].toString());
                System.out.println(" ");
            }
        }
    }
}
