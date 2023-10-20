public class Revista  extends ItemBiblioteca{
    private String edicao;
    
    public Revista(String titulo, int publicacao, int numCopias, String edicao) {
        super(titulo, publicacao, numCopias);
        this.edicao = edicao;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    @Override
    public void calcular_multa(int qtdDias) {
        double aux = qtdDias * 0.10;
        System.out.println("Você vai ter que pagar: R$"+ aux);
    }

    @Override
    public String toString() {
        return super.toString()+ "edição=" + this.edicao;
    }
}
