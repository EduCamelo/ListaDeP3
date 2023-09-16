public class Carro {
    private String marca;
    private String modelo;
    private int AnoDeFabricacao;
    private double velocidade;


    public Carro(String marca, String modelo, int anoDeFabricacao, double velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        AnoDeFabricacao = anoDeFabricacao;
        this.velocidade = velocidade;
    }

    public void acelerar(int x){
        this.velocidade += x;
    }

    public void desacelerar(int x){
        if(this.velocidade - x < 0){
            this.velocidade =0;
        }
        else{
            this.velocidade -= 0;
        }
    }

}
