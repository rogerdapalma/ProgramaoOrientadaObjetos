package Aula06.Ex002;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String genero;
    private boolean emprestado;

    public Livro(String titulo, String autor, int anoPublicacao, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
        this.emprestado = false;
    }

    public String getInfo() {
        return "Título: " + titulo + "\n" +
                "Autor: " + autor + "\n" +
                "Ano de Publicação: " + anoPublicacao + "\n" +
                "Gênero: " + genero + "\n" +
                "Emprestado: " + (emprestado ? "Sim" : "Não");
    }

    public boolean emprestar() {
        if (emprestado) {
            System.out.println("O livro já está emprestado.");
            return false;
        } else {
            emprestado = true;
            System.out.println("Livro emprestado com sucesso.");
            return true;
        }
    }

    public boolean devolver() {
        if (!emprestado) {
            System.out.println("O livro não está emprestado.");
            return false;
        } else {
            emprestado = false;
            System.out.println("Livro devolvido com sucesso.");
            return true;
        }
    }
}