import java.util.ArrayList;

public class MainBiblioteca {
    public static void main(String[] args) {
        ArrayList<Livro> livros = new ArrayList<>();//Criando o array de livros
        Livro livro1 = new Livro(true);//Criando livro
        livros.add(livro1);//Add livro no array
        livros.add(new Livro(false));//Obs: experimento foi bom e conclusivo
        for (Livro livro : livros) {
            livro.pegarLivro();//obs: chamar variavel(livro) do foreach e não o array(livros) 
        }
    }
}
