package pratica.classeAbstraata;


public class ProdutoAlimenticio extends Produto {
    public ProdutoAlimenticio(String nome, double preco) {
        super(nome, preco);
    }
    @Override
    public void calcularDesconto(){
     double desconto = getPreco() * 0.1;
        System.out.println("desconto do produto: " + desconto );
    }
}
