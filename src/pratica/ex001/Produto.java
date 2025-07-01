package pratica.ex001;

abstract class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) throws PrecoInvalidoException {
        this.nome = nome;
        setPreco(preco);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) throws PrecoInvalidoException {
        if (preco < 0) {
            throw new PrecoInvalidoException("O preço não pode ser negativo.");
        }
        this.preco = preco;
    }

    @Override
    public String toString() {
        return nome + " - R$ " + preco;
    }
}