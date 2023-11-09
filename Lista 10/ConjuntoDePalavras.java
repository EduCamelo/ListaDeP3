import java.util.HashSet;
import java.util.Set;

public class ConjuntoDePalavras {
    private Set<String> conjunto;

    public ConjuntoDePalavras(String palavras) {
        String[] palavrasArray = palavras.split(",");
        conjunto = new HashSet<>();
        for (String palavra : palavrasArray) {
            conjunto.add(palavra.trim());
        }
    }

    public boolean contemTodas(String palavras) {
        String[] palavrasArray = palavras.split(",");
        for (String palavra : palavrasArray) {
            if (!conjunto.contains(palavra.trim())) {
                return false;
            }
        }
        return true;
    }
}