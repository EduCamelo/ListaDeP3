import java.util.ArrayList;

public class MainPedido {
  public static void main(String[] args) {
        ArrayList<Pedido> pedidos = new ArrayList<>(); // Cria a Lista de pedidos

        Pedido pedido1 = new Pedido(1);// Cria a o número que vai chamar o pedido 
        ItemPedido burgao = new ItemPedido("Burgão", 100.0);// Cria o item do pedido
        pedido1.adicionar(burgao);//Adiciona o item na lista
        ItemPedido dogao = new ItemPedido("Dogão", 900.0);
        pedido1.adicionar(dogao);//Adiciona o item na lista
        pedidos.add(pedido1);//Adiciona a lista a lista de pedidos

        for (Pedido pedido : pedidos) {//Busca a classe na lista de pedidos
            double totalPedido = pedido.getValorTotal(); 
            System.out.println("Pedido #" + pedido.numero + " - Total: R$" + totalPedido);

            if (totalPedido > 500) {
                System.out.println("Pedido #" + pedido.numero + " tem valor total superior a R$ 500.");//Comparação
            }
        }
    }
}
