package pratica.TUDO;

public class ProdutoAlimenticio extends Produto implements Descontavel {
    public ProdutoAlimenticio(String nome, double preco) throws PrecoInvalidoException {
        super(nome, preco);
    }

    @Override
    public void aplicarDesconto(double percentual) {
        try {
            double novoPreco = getPreco() * (1 - percentual / 100);
            setPreco(novoPreco);
            System.out.printf("Desconto aplicado. Novo preço: R$ %.2f%n", getPreco());
        } catch (PrecoInvalidoException e) {
            System.out.println("Erro ao aplicar desconto: " + e.getMessage());
        }
    }

    @Override
    public void calcularFrete() {
        System.out.println("Frete fixo para produto alimentício: R$5.00");
    }
}
