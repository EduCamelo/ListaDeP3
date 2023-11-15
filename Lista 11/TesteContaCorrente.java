import java.util.Scanner;

public class TesteContaCorrente {
    public static void main(String[] args) {
       
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o número da conta: ");
            String numeroConta = scanner.nextLine();
            System.out.print("Digite o saldo inicial: ");
            double saldoInicial = scanner.nextDouble();
            ContaCorrente conta = new ContaCorrente(numeroConta, saldoInicial);
            for (int i = 0; i < 10; i++) {
                System.out.print("Digite o valor do saque " + (i + 1) + ": ");
                double valorSaque = scanner.nextDouble();
                try {
                    conta.sacar(valorSaque);
                } catch (SaldoInsuficienteException e) {
                    System.err.println("Erro: " + e.getMessage());
                }
            }

            System.out.println("Saldo final da conta " + conta.getNumeroConta() + ": R$ " + conta.getSaldo());
        }
    }
}