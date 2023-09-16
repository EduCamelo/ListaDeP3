public class Post {
    private String texto;
    private String link;
    private int numeroCurtidas;
    private int numeroCompartilhamentos;

    public int getNumeroCurtidas() {
        return numeroCurtidas;
    }

    public int getNumeroCompartilhamentos() {
        return numeroCompartilhamentos;
    }

    public Post(String texto, String link) {
        this.texto = texto;
        this.link = link;
        this.numeroCompartilhamentos = 0;
        this.numeroCurtidas=0;
    }

    public void curtir(){
        this.numeroCurtidas++;
    }
    public void compartilhar(){
        this.numeroCompartilhamentos++;
    }

}
