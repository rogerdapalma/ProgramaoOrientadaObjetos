package pratica.TUDO;

public class ProdutoEletronico extends Produto implements Descontavel {
    public ProdutoEletronico(String nome, double preco) throws PrecoInvalidoException {
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
        System.out.println("Frete para produto eletrônico: R$15.00");
    }
}
