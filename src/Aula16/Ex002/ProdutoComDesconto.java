package Aula16.Ex002;

class ProdutoComDesconto extends Produto {
    private double percentualDesconto;

    public ProdutoComDesconto(double preco, double percentualDesconto) {
        super(preco);
        this.percentualDesconto = percentualDesconto;
    }

    @Override
    public void desconto() {
        double precoComDesconto = preco - (preco * percentualDesconto / 100);
        System.out.printf("Preço com %.0f%% de desconto: R$ %.2f\n", percentualDesconto, precoComDesconto);
    }

    public static void main(String[] args) {
        ProdutoComDesconto produto = new ProdutoComDesconto(200.0, 15);
        produto.desconto();
    }
}

