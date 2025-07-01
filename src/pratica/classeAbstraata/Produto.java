package pratica.classeAbstraata;

// Classe abstrata Produto
public abstract class Produto {
    private String nome;
    private double preco;

    // Construtor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Getter e Setter (encapsulamento)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método concreto (já implementado)
    public void exibirInfo() {
        System.out.println("Produto: " + nome + " | Preço: R$" + preco);
    }

    // Método abstrato (OBRIGA as subclasses a implementarem)
    public abstract void calcularDesconto();
}
