package Aula17.Ex.Ex001;

class Produto1 {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto1(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + ", Preço: R$" + preco + ", Quantidade: " + quantidade;
    }
}
