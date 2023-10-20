public class Livro extends ItemBiblioteca{
    private String autor;
    public Livro(String titulo, int publicacao, int numCopias, String autor) {
        super(titulo, publicacao, numCopias);
        this.autor = autor;
    }

    @Override
    public void calcular_multa(int qtdDias) {
        double aux = qtdDias * 0.20;
        System.out.println("Você vai ter que pagar: R$"+ aux);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return super.toString() + " autor="+this.autor;
    }
}
