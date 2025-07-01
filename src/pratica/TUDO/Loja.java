package pratica.TUDO;

public class Loja {
    public static void main(String[] args) {
        try {
            Produto p1 = new ProdutoAlimenticio("Arroz", 20.0);
            Produto p2 = new ProdutoEletronico("Notebook", 3000.0);

            p1.exibirInformacoes();
            p1.calcularFrete();
            ((Descontavel) p1).aplicarDesconto(10);
            p1.exibirInformacoes();

            p2.exibirInformacoes();
            p2.calcularFrete();
            ((Descontavel) p2).aplicarDesconto(15);
            p2.exibirInformacoes();

            // Testando erro
            Produto p3 = new ProdutoEletronico("Celular", -1000.0);

        } catch (PrecoInvalidoException e) {
            System.out.println("Erro ao criar ou modificar produto: " + e.getMessage());
        }
    }
}
