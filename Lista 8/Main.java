public class Main {
    public static void main(String[] args) {
        PilhaDeCaixas x = new PilhaDeCaixas(10);
        x.empilhar(new Caixa("qualquer", ":)", 10, 12 ));
        x.empilhar(new Caixa("qualquer1", ":)1", 11, 12 ));
        x.empilhar(new Caixa("qualquer2", ":)1", 11, 12 ));
        x.empilhar(new Caixa("qualquer3", ":)1", 20, 12 ));
        x.empilhar(new Caixa("qualquer4", ":)1", 21, 12 ));
        x.empilhar(new Caixa("qualquer5", ":)1", 22, 12 ));
        x.empilhar(new CaixaFragil("teste", ":)1", 22, 12, 200));
        x.empilhar(new Caixa("qualquer6", ":)1", 23, 12 ));
        x.empilhar(new Caixa("qualquer7", ":)1", 24, 12 ));
        x.exibirDados();
    
    }
}
