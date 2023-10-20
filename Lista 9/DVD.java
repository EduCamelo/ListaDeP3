public class DVD extends ItemBiblioteca{
    private int duracao;
    public DVD(String titulo, int publicacao, int numCopias, int duracao) {
        super(titulo, publicacao, numCopias);
        this.duracao = duracao;
    }
    @Override
    public void calcular_multa(int qtdDias) {
        double aux = qtdDias * 0.30;
        System.out.println("Você vai ter que pagar: R$"+ aux);
    }
    public double getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    @Override
    public String toString() {
        return super.toString() +"Duração em minutos="+this.duracao;
    }
    
}
