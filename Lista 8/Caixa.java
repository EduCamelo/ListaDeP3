public class Caixa {
    protected String identificador;
    protected String conteudo;
    protected double peso;
    protected double altura;
    
    public Caixa(String identificador, String conteudo, double peso, double altura) {
        this.identificador = identificador;
        this.conteudo = conteudo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void exibirEtiqueta() {
        System.out.println("Identificador: " + identificador);
        System.out.println("Conteúdo: " + conteudo);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " cm");
    }
    
}
