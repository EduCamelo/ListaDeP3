public class Paciente {
    private String codigo;
    private String nome;
    private int idade;
    private String sexo;
    private boolean planoSaude;
    private String alergia;
    private String tipoSanguineo;

    public Paciente(String codigo, String nome, int idade, String sexo, boolean planoSaude, String alergia,
            String tipoSanguineo) {
        this.codigo = codigo;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.planoSaude = planoSaude;
        this.alergia = alergia;
        this.tipoSanguineo = tipoSanguineo;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPlanoSaude(boolean planoSaude) {
        this.planoSaude = planoSaude;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getAlergia() {
        return alergia;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public String toString() {
        return "Código: " + this.codigo + "Nome: " + this.nome + "Idade: " + this.idade + "Sexo: " + this.sexo
                + "Plano de saúde: " + this.planoSaude + "Tem alergia(s) a: " + this.alergia + "Tipo de Sangue: "
                + this.tipoSanguineo;
    }

}