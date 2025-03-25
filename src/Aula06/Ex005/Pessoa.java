package Aula06.Ex005;

import java.util.Scanner;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        System.out.println("Construtor com nome e idade chamado.");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public Pessoa(int idade) {
        this.nome = "Não informado";
        this.idade = idade;
        System.out.println("Construtor com apenas idade chamado.");
        System.out.println("Idade: " + idade);
    }
}