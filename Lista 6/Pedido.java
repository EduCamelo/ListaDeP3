import java.util.ArrayList;

public class Pedido {
    int numero;
    private ArrayList<ItemPedido> pedidos = new ArrayList<>();
    private double valorTotal;

    public Pedido(int num){
        this.numero = num;
    }

    public void adicionar(ItemPedido x){
        pedidos.add(x);
        valorTotal += x.getPreço(); 
    }

    public double getValorTotal() {
        return valorTotal;
    }

}