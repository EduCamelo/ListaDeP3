public class ContaCorrente {
    private String numeroConta;
    private double saldo;

    public ContaCorrente(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque.");
        }
        saldo -= valor;
        System.out.println("Saque de R$ " + valor + " realizado com sucesso. Saldo restante: R$ " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }
}