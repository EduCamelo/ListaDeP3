public class Livro {
    private boolean disponivel;

    public Livro(boolean disponivel){
        this.disponivel = disponivel;
    }

    public boolean verificarDisponibilidade(){
        return this.disponivel;
    }

    public void pegarLivro(){
        if(this.disponivel){
            this.disponivel = false;
            System.out.println("Você pegou o livro"); 
        }
        else{
            System.out.println("Livro indisponivel");
        }
    }

}
