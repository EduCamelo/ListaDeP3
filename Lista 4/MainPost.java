public class MainPost {
    public static void main(String[] args) {
        Post x = new Post("não tenho facebook :)", "mangalivre.net");
        for(int i = 0; i<3;i++){
            x.curtir();
        }
        System.out.println(x.getNumeroCurtidas());
        x.compartilhar();
        x.compartilhar();
        System.out.println(x.getNumeroCompartilhamentos());
    }
}
