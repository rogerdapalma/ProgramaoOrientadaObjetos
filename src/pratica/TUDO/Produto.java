package pratica.TUDO;

public abstract class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) throws PrecoInvalidoException {
        setNome(nome);
        setPreco(preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws PrecoInvalidoException {
        if (nome == null || nome.trim().isEmpty()) {
            throw new PrecoInvalidoException("Nome não pode ser vazio.");
        }
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) throws PrecoInvalidoException {
        if (preco < 0) {
            throw new PrecoInvalidoException("Preço não pode ser negativo.");
        }
        this.preco = preco;
    }

    public void exibirInformacoes() {
        System.out.printf("Produto: %s | Preço: R$ %.2f%n", nome, preco);
    }

    // Método abstrato que força subclasses a implementar
    public abstract void calcularFrete();
}
