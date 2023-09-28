public class Diretor extends Funcionario{
    private int segTurno;
    
    public Diretor(String nome, int inscricao, String turno, double salario, int segTuro) {
        super(nome, inscricao, turno, salario);
        this.segTurno = segTurno;
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

    public void criarDesconto(){

    }

    public void encomendarFardas(){

    }

    public void gerenciarProfessores(){
        
    }

    @Override
    public String funcaoDesempenhar() {
        return "Diretor";
    }

    @Override
    public String toString() {
        return "Diretor [segTurno=" + segTurno + "]" + super.toString();
    }
    
}
