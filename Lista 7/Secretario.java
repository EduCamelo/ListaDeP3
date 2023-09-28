public class Secretario extends Funcionario {

    public Secretario(String nome, int inscricao, String turno, double salario) {
        super(nome, inscricao, turno, salario);
        //TODO Auto-generated constructor stub
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
    
    public void receberEncomenda(){}
    public void receberPagamento(){}
}
