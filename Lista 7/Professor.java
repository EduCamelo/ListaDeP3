public class Professor extends Funcionario{
    private String disciplina;
    public Professor(String nome, int inscricao, String turno, double salario, String disciplina) {
        super(nome, inscricao, turno, salario);
        this.disciplina = disciplina;
    }

    @Override
    public void horariosDisponiveis() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'horariosDisponiveis'");
    }

    @Override
    public int horarioTrabalho() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'horarioTrabalho'");
    }

    @Override
    public void informacoesFuncionario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'informacoesFuncionario'");
    }

    @Override
    public String funcaoDesempenhar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'funcaoDesempenhar'");
    }

    public void lecionar(){}
    public void criarAtividade(){}
    
}
