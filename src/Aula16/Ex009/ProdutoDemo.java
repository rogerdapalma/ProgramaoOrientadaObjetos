package Aula16.Ex009;

import java.util.*;
public class ProdutoDemo {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Arroz", 5.49, 10));
        produtos.add(new Produto("Feijão", 7.99, 8));
        produtos.add(new Produto("Macarrão", 4.29, 15));
        produtos.add(new Produto("Batata", 4.00,10));
        produtos.add(new Produto("carne", 100.00,1000));

        for (Produto p : produtos) {
            System.out.println(p);
        }
    }
}
