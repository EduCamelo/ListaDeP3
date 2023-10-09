import java.util.Stack;

public class PilhaDeCaixas {
    private double alturaMax;
    private Stack<Caixa> pilha;

    public PilhaDeCaixas(int tam) {
        this.alturaMax = 100;
        this.pilha = new Stack<>();
    }

    public double getPesoAtual() {
        double pesoAtual = 0;
        for (Caixa caixa : pilha) {
            pesoAtual += caixa.getPeso();
        }
        return pesoAtual;
    }

    public double getAlturaAtual() {
        double alturaAtual = 0;
        for (Caixa caixa : pilha) {
            alturaAtual += caixa.getAltura();
        }
        return alturaAtual;
    }

    public boolean empilhar(Caixa caixa) {
        if (getAlturaAtual() + caixa.getAltura() <= alturaMax) {
            if (caixa instanceof CaixaFragil) {
                double pesoTotal = caixa.getPeso() + getPesoAtual();
                double pesoMaximoSuportado = ((CaixaFragil) caixa).getMaxDePeso();
                if (pesoTotal <= pesoMaximoSuportado) {
                    pilha.push(caixa);
                    return true;
                } else {
                    return false;
                }
            } else {
                pilha.push(caixa);
                return true;
            }
        } else {
            return false;
        }
    }

    public Caixa desempilhar() {
        if (!pilha.isEmpty()) {
            return pilha.pop();
        } else {
            System.out.println("A pilha está vazia. Não há mais caixas para desempilhar.");
            return null;
        }
    }

    public void exibirDados() {
        System.out.println("Caixas empilhadas:");
        for (Caixa caixa : pilha) {
            caixa.exibirEtiqueta();
            System.out.println("--------------------");
        }
        System.out.println("Altura atual da pilha: " + getAlturaAtual() + " cm");
        System.out.println("Peso total atual da pilha: " + getPesoAtual() + " kg");
    }
}
