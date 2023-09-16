public class ContaBancaria{
    private String NomeDoTitular;
    private double Saldo;
    private int NumDaConta;
    
    public ContaBancaria(String nomeDoTitular, double saldo, int numDaConta) {
        NomeDoTitular = nomeDoTitular;
        Saldo = saldo;
        NumDaConta = numDaConta;
    }
    
    public String getNomeDoTitular() {
        return NomeDoTitular;
    }
    public void setNomeDoTitular(String nomeDoTitular) {
        NomeDoTitular = nomeDoTitular;
    }
    public double getSaldo() {
        return Saldo;
    }
    public void setSaldo(double saldo) {
        Saldo = saldo;
    }
    public int getNumDaConta() {
        return NumDaConta;
    }
    public void setNumDaConta(int numDaConta) {
        NumDaConta = numDaConta;
    }



    
}