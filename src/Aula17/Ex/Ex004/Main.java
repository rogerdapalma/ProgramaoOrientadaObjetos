package Aula17.Ex.Ex004;

import Aula06.Ex002.Livro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Livro2> livros = new ArrayList<>();
        livros.add(new Livro2("Dom Casmurro", "Machado de Assis", 1899));
        livros.add(new Livro2("1984", "George Orwell", 1949));
        livros.add(new Livro2("O Hobbit", "J.R.R. Tolkien", 1937));

        Collections.sort(livros, Comparator.comparingInt(Livro2::getAno));

        for (Livro2 livro2 : livros) {
            System.out.println(livro2);
        }
    }
}
