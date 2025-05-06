package Aula16.Ex012;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LivroDemo {
    public static void main(String[] args) {
        List<Livro> livros = new ArrayList<>();

        livros.add(new Livro("Dom Casmurro", "Machado de Assis", 1899));
        livros.add(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954));
        livros.add(new Livro("1984", "George Orwell", 1949));

        livros.sort(Comparator.comparingInt(Livro::getAno));

        for (Livro l : livros) {
            System.out.println(l);
        }
    }
}
