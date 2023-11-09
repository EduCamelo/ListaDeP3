public class MainAluno {
    public static void main(String[] args) {
        CadastroAluno cadastro = new CadastroAluno();
        // Adicionar 10 alunos ao cadastro (você pode receber os dados do usuário aqui)

        // Exemplo com dados fixos
        cadastro.adicionarAluno(new Aluno(1, "Aluno1", 20, "Curso A"));
        // Adicionar mais alunos aqui...

        cadastro.imprimirAlunos();
    }
}