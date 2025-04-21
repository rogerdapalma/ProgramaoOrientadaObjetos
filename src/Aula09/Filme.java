package Aula09;

import java.util.Scanner;

class Filme {
    private String titulo;
    private String diretor;
    private int duracaoEmMinutos;
    private String genero;

    public Filme(String titulo, String diretor, int duracaoEmMinutos, String genero) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.genero = genero;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Diretor: " + diretor);
        System.out.println("Duração: " + duracaoEmMinutos + " minutos");
        System.out.println("Gênero: " + genero);
    }

    public boolean ehLongo() {
        return duracaoEmMinutos > 120;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o título do filme:");
        String titulo = scanner.nextLine();
        System.out.println("Digite o diretor:");
        String diretor = scanner.nextLine();
        System.out.println("Digite a duração em minutos:");
        int duracao = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o gênero:");
        String genero = scanner.nextLine();

        Filme filme = new Filme(titulo, diretor, duracao, genero);
        filme.exibirDetalhes();
        System.out.println("O filme é longo? " + filme.ehLongo());
    }
}