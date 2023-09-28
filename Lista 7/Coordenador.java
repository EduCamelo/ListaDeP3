public class Coordenador extends Funcionario{

    public Coordenador(String nome, int inscricao, String turno, double salario) {
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

    public void auxiliarProfessor(){
        
    }

    @Override
    public String funcaoDesempenhar() {
        return "Coordenador";
    }
    
}
