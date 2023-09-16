public class Medico {
    private String codigo;
    private String nome;
    private String sexo;
    private String especialidade;
    private Endereco endereco;

    public Medico(String codigo, String nome, String sexo, String especialidade, Endereco endereco) {
        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
        this.especialidade = especialidade;
        this.endereco = endereco;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String toString() {
        return "Código: " + this.codigo + "Nome: " + this.nome + "Especialidade: " + this.especialidade + "Sexo: " + this.sexo + endereco.toString();
    }

}
