package pratica;

import java.sql.SQLOutput;

public class Loja {
    public static void main(String[] args) {
        try{
            Produto p1 = new ProdutoAlimenticio("arroz",20.0);
            Produto p2 = new ProdutoEletronico("Fone",150.0);

            System.out.println(p1);
            System.out.println(p2);

            ((Descontavel) p1).aplicarDesconto(10);
            ((Descontavel)p2).aplicarDesconto(15);

            System.out.println("desconto aplicado");
            System.out.println(p1);
            System.out.println(p2);

            Produto p3 = new ProdutoAlimenticio("CARNE",-50.0);
        } catch (PrecoInvalidoException e) {
            System.out.println("Erro ao criar produto: " + e.getMessage());
        }
    }
}
