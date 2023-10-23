public class Main{
    public static void main(String[] args) {
        // Exemplo de uso do sistema de biblioteca
        Livro livro = new Livro("Livro 1", 2000, 3, "Autor 1");
        DVD dvd = new DVD("DVD 1", 2010, 2, 120);
        Revista revista = new Revista("Revista 1", 2020, 5, "1");
        int dataDevolucaoAtrasada = 7;
        livro.calcular_multa(dataDevolucaoAtrasada);
        dvd.calcular_multa(dataDevolucaoAtrasada);
        revista.calcular_multa(dataDevolucaoAtrasada);
    }
}