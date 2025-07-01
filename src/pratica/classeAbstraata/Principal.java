package pratica.classeAbstraata;

public class Principal {
    public static void main(String[] args) {
        Produto p = new ProdutoAlimenticio("arroz", 10.0);
        p.calcularDesconto();
        p.exibirInfo();
    }
}
