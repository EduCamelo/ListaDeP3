public class Aluno{
    private String nome;
    private int matricula;
    private double[] notas = new double[3];
    private int aux;

    public Aluno(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public void setNotas(double notas) {
        this.notas[aux] = notas;
        this.aux++;
    }

    public double calcularMedia(){
        double media =0;
        for(int i = 0; i<this.notas.length;i++){
            media += this.notas[i];
        }
        return media/3;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", matricula=" + matricula + "]";
    }

}