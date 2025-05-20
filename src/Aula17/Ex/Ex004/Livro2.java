package Aula17.Ex.Ex004;


class Livro2 {
    private String titulo;
    private String autor;
    private int ano;

    public Livro2(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Ano: " + ano;
    }
}