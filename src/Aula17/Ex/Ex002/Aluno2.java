package Aula17.Ex.Ex002;

import java.util.ArrayList;
import java.util.List;

class Aluno2 {
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno2(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public String getNome() {
        return nome;
    }
}