public class Funcionario{
    private String nome;
    private double salarioAnual;
    private int idade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalarioAnual() {
        return salarioAnual;
    }
    public void setSalarioAnual(double salarioAnual) {
        this.salarioAnual = salarioAnual;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public Funcionario(String nome, double salarioAnual, int idade) {
        this.nome = nome;
        this.salarioAnual = salarioAnual;
        this.idade = idade;
    }
    public String toString() {
        return "Funcionario \nnome: " + nome + ", \nsalarioAnual: R$" + salarioAnual + ", \nidade: " + idade;
    }
}