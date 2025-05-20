package Aula17.Ex.Atividade;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Ex 1
        Aluno3 a1 = new Aluno3("Julia", 7.5);
        Aluno3 a2 = new Aluno3("Marcos", 5.0);
        Boletim.imprimirStatus(a1);
        Boletim.imprimirStatus(a2);

        // Ex 2
        Produto3 p1 = ProdutoFactory.criarProdutoDesconto("Notebook", 3000.00);
        System.out.println(p1);

        // Ex 3
        List<Livro3> livros = new ArrayList<>();
        livros.add(new Livro3("Dom Quixote", "Miguel de Cervantes"));
        livros.add(new Livro3("A Revolução dos Bichos", "George Orwell"));
        LivroUtil.imprimirLivros(livros);

        // Ex 4
        Conta3 conta = new Conta3("Luciana", 1000.0);
        conta.depositar(500.0);
        System.out.println(conta);
    }
}