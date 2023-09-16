import java.util.Scanner;

public class Livro {
    private String titulo;
    private String autor;
    private int AnoDePublicacao;

    public Livro(String titulo, String autor, int anoDePublicacao) {
        setAnoDePublicacao(anoDePublicacao);
        setAutor(autor);
        setTitulo(titulo);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoDePublicacao() {
        return AnoDePublicacao;
    }

    public void setAnoDePublicacao(int anoDePublicacao) {
        if (anoDePublicacao < 0) {
            System.out.println("valor inválido");
            do {
                Scanner input = new Scanner(System.in);
                System.out.println("Digite um novo valor para o ano de Publicacão");
                anoDePublicacao = input.nextInt();
                if (anoDePublicacao < 0) {
                    System.out.println("valor inválido");
                }
            } while (anoDePublicacao < 0);
        } else {
            this.AnoDePublicacao = anoDePublicacao;
        }
    }
}
