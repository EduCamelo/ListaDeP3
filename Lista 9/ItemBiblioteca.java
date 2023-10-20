public abstract class ItemBiblioteca{
    private String titulo;
    private int publicacao;
    private int numCopias;

    public ItemBiblioteca(String titulo, int publicacao, int numCopias) {
        this.titulo = titulo;
        this.publicacao = publicacao;
        this.numCopias = numCopias;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPublicacao() {
        return publicacao;
    }

    public int getNumCopias() {
        return numCopias;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPublicacao(int publicacao) {
        this.publicacao = publicacao;
    }

    public void setNumCopias(int numCopias) {
        this.numCopias = numCopias;
    }

    @Override
    public String toString() {
        return "ItemBiblioteca [titulo=" + titulo + ", publicacao=" + publicacao + ", numCopias=" + numCopias + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
        result = prime * result + publicacao;
        result = prime * result + numCopias;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ItemBiblioteca other = (ItemBiblioteca) obj;
        if (titulo == null) {
            if (other.titulo != null)
                return false;
        } else if (!titulo.equals(other.titulo))
            return false;
        if (publicacao != other.publicacao)
            return false;
        if (numCopias != other.numCopias)
            return false;
        return true;
    }

     public abstract void calcular_multa(int qtdDias);
}