package Aula17.Ex.Ex001;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto1> produtos = new ArrayList<>();

        produtos.add(new Produto1("Arroz", 5.99, 10));
        produtos.add(new Produto1("Feijão", 7.49, 5));
        produtos.add(new Produto1("Macarrão", 3.89, 8));

        for (Produto1 produto : produtos) {
            System.out.println(produto);
        }
    }
}
