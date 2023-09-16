public class Endereco {
    private String rua;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;

    public Endereco(String rua,String numero, String complemento, String bairro, String cidade, String uf, String cep){
        setBairro(bairro);
        setRua(rua);
        setCep(cep);
        setCidade(cidade);
        setNumero(numero);
        setUf(uf);
        setComplemento(complemento);
        
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }

    public String toString() {
        return "Rua: " + this.rua + "Bairro: " + this.bairro + "CEP: " + this.cep + "Cidade: " + this.cidade
                + "Complemento: " + this.complemento + "Número: " + this.numero + "UF: "
                + this.uf;
    }

}
