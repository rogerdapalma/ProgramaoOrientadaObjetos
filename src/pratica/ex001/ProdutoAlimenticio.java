package pratica.ex001;

public class ProdutoAlimenticio extends Produto implements Descontavel{


    public ProdutoAlimenticio(String nome, double preco) throws PrecoInvalidoException {
        super(nome, preco);
    }
    public void aplicarDesconto(double percentual) {
        try {
            double novoPreco = getPreco() * (1 - percentual / 100);
            setPreco(novoPreco);

        }catch (PrecoInvalidoException e) {
            System.out.println("Erro  ao  aplicar desconto : " + e.getMessage());
        }
    }

}

