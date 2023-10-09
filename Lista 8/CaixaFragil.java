public class CaixaFragil extends Caixa {
    private double maxDePeso;
    
    public CaixaFragil(String identificador, String conteudo, double peso, double altura, double maxDePeso) {
        super(identificador, conteudo, peso, altura);
        this.maxDePeso = maxDePeso;
    }

    public double getMaxDePeso() {
        return maxDePeso;
    }

    public void setMaxDePeso(double maxDePeso) {
        this.maxDePeso = maxDePeso;
    }
    public void exibirEtiqueta() {
        super.exibirEtiqueta();
        System.out.println("Peso Máximo Suportado: " + this.maxDePeso + " kg");
    }
    
}
