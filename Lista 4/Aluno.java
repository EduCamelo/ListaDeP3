public class Aluno {
    private String nome;
    private String cpf;
    private int nota[];
    
    public Aluno(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        nota = new int[4];
    }
    public void setNota(int[] nota) {
        this.nota = nota;
    }

    public int calcularMedia(){
        int media=0;
        for(int i =0; i<nota.length;i++){
            media += nota[i];
        }
        media /= 4;
        return media;
    }
    
}
