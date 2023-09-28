public abstract class Funcionario {
    private String nome;
    private int inscricao;
    private String turno;
    private double salario;
    
    public Funcionario(String nome, int inscricao, String turno, double salario) {
        this.nome = nome;
        this.inscricao = inscricao;
        this.turno = turno;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getInscricao() {
        return inscricao;
    }

    public void setInscricao(int inscricao) {
        this.inscricao = inscricao;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", inscricao=" + inscricao + ", turno=" + turno + ", salario=" + salario
                + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Funcionario other = (Funcionario) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (inscricao != other.inscricao)
            return false;
        if (turno == null) {
            if (other.turno != null)
                return false;
        } else if (!turno.equals(other.turno))
            return false;
        if (Double.doubleToLongBits(salario) != Double.doubleToLongBits(other.salario))
            return false;
        return true;
    }
    
    public abstract void horariosDisponiveis();    
    public abstract int horarioTrabalho();
    public abstract void informacoesFuncionario();
    public abstract String funcaoDesempenhar();


}
