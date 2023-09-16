import java.util.Arrays;

public class CarrinhoDeCompras {
    public String[] lista;
    public int qtd;

    public CarrinhoDeCompras(int x) {
        this.lista = new String[x];
        this.qtd = 0;
    }

    public void add(String item) {
        this.lista[qtd] = item;
        this.qtd++;
        this.bubblesort();
    }

    public void remover(String item) {
        if (this.qtd != 0) {
            this.lista[qtd - 1] = null;
            this.qtd--;
            this.bubblesort();
        } else {
            if (this.lista[0] != null) {
                this.lista[0] = null;
                this.bubblesort();
            }
            else{
                System.out.println("Lista vazia");
            }
        }
    }

    public void bubblesort() {
        for (int i = 0; i < qtd - 1; i++) {
            for (int j = 0; j < qtd - i - 1; j++) {
                if (lista[j].compareTo(lista[j + 1]) > 0) {
                    String aux = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = aux;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras [lista=" + Arrays.toString(lista) + "]";
    }

}
