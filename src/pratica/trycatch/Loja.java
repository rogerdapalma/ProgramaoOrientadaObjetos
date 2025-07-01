package pratica.trycatch;



public class Loja {
    public static void main(String[] args) {
        try{
            Produto p1 = new ProdutoAlimenticio("arroz", 20.0);
            Produto p2 = new ProdutoAlimenticio("feijao", -150.0);

            p1.exibirInformacoes();
            ((Descontavel) p1).aplicarDesconto(10);
            p1.exibirInformacoes();
        }catch (PrecoInvalidoException e){
            System.out.println("Erro ao criar produto: " + e.getMessage());
        }

    }
}
