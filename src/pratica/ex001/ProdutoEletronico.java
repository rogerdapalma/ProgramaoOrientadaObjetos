package pratica.ex001;

public class ProdutoEletronico extends Produto implements Descontavel{
    public ProdutoEletronico(String nome, double preco) throws PrecoInvalidoException {
        super(nome, preco);
    }

    @Override
    public void aplicarDesconto(double percentual) {
        try{
            double novoPreco = getPreco() * (1 - percentual/100);
            setPreco(novoPreco);

        }catch (PrecoInvalidoException e) {
            System.out.println("Erro ao aplicar desconto: " + e.getMessage());
        }

    }

}
