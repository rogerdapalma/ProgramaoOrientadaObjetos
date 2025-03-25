package Aula06.Ex006;

public class Aluno {
    private String nome;
    private String matricula;
    private String dataNascimento;
    private int anoIngresso;

    // Construtor 1 - nome e matrícula
    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        System.out.println("[Construtor 1] Nome: " + nome);
        System.out.println("[Construtor 1] Matrícula: " + matricula);
    }

    // Construtor 2 - data de nascimento
    public Aluno(String dataNascimento) {
        this.dataNascimento = dataNascimento;
        System.out.println("[Construtor 2] Data de Nascimento: " + dataNascimento);
    }

    // Construtor 3 - nome, data de nascimento e ano de ingresso
    public Aluno(String nome, String dataNascimento, int anoIngresso) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.anoIngresso = anoIngresso;
        System.out.println("[Construtor 3] Nome: " + nome);
        System.out.println("[Construtor 3] Data de Nascimento: " + dataNascimento);
        System.out.println("[Construtor 3] Ano de Ingresso: " + anoIngresso);
    }
}
