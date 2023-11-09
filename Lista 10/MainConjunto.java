public class MainConjunto {
    public static void main(String[] args) {
        ConjuntoDePalavras conjuntoDePalavras = new ConjuntoDePalavras("palavra1, palavra2, palavra3");

        String palavras = "palavra1, palavra2";
        if (conjuntoDePalavras.contemTodas(palavras)) {
            System.out.println("Todas as palavras estão no conjunto.");
        } else {
            System.out.println("Algumas palavras não estão no conjunto.");
        }
    }
}