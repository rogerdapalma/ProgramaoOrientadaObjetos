package Aula17.Ex.Atividade;

import java.util.List;

class Livro3 {
    private String titulo;
    private String autor;

    public Livro3(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor;
    }
}

class LivroUtil {
    public static void imprimirLivros(List<Livro3> livros) {
        for (Livro3 livro : livros) {
            System.out.println(livro);
        }
    }
}
