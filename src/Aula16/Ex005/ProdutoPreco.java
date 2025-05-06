package Aula16.Ex005;

class ProdutoPreco {
    public double calcularPrecoFinal(double preco) {
        return preco;
    }

    public double calcularPrecoFinal(Cliente cliente, double preco) {
        double desconto = preco * cliente.getPercentualDesconto() / 100;
        return preco - desconto;
    }

    public static void main(String[] args) {
        ProdutoPreco produto = new ProdutoPreco();
        Cliente cliente = new Cliente(10);

        double precoOriginal = 100.0;
        double precoFinal = produto.calcularPrecoFinal(precoOriginal);
        double precoComDesconto = produto.calcularPrecoFinal(cliente, precoOriginal);

        System.out.printf("Preço original: R$ %.2f\n", precoOriginal);
        System.out.printf("Preço com desconto para cliente: R$ %.2f\n", precoComDesconto);
    }
}
