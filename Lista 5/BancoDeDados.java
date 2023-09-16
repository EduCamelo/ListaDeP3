public class BancoDeDados {
    private int[] dados;
    private int aux;
    
    public BancoDeDados(int x) {
        this.dados = new int[x];
        aux=0;
    }

    public int[] getDados() {
        return dados;
    }

    public void adicionar(int x){
        this.dados[aux] = x;
        aux++;
    }

    public void atualizar(int x, int y){
        if(x > this.dados.length){
            System.out.println("Local inválido");
        }
        else{
            this.dados[x] = y;
        }
    }

    public void excluir(int x, int y){
        if(x > this.dados.length){
            System.out.println("Local inválido");
        }
        else{
            this.dados[x] = 0;
        }
    }

    public void exibir(){
        for(int i =0; i<aux ;i++){
            System.out.println(this.dados[aux]);
        }
    }
}
