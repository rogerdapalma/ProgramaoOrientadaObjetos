package pratica.classeInterface;

public class Loja {
    public static void main(String[] args) {
        Produto p = new Produto("notebook", 1000.0);
        System.out.println("preço oritignal:" + p.getPreco());


        p.aplicarDesconto(10);
    }
}
