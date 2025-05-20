package Aula17.Ex.Atividade;

class Produto3 {
    private String nome;
    private double preco;

    public Produto3(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + ", Preço: R$" + preco;
    }
}

class ProdutoFactory {
    public static Produto3 criarProdutoDesconto(String nome, double preco) {
        double precoComDesconto = preco * 0.9;
        return new Produto3(nome, precoComDesconto);
    }
}
