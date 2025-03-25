package Aula06.Ex001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a) Conteúdo original
        Disciplina disciplina = new Disciplina("Matemática", 60, "Prof. Silva");
        System.out.println("Conteúdo original:");
        System.out.println("Nome: " + disciplina.getNome());
        System.out.println("Carga Horária: " + disciplina.getCargaHoraria());
        System.out.println("Professor: " + disciplina.getNomeProfessor());

        // b) Inserir novos valores
        System.out.println("\nDigite o novo nome da disciplina:");
        disciplina.setNome(scanner.nextLine());

        System.out.println("Digite a nova carga horária:");
        disciplina.setCargaHoraria(Integer.parseInt(scanner.nextLine()));

        System.out.println("Digite o nome do novo professor:");
        disciplina.setNomeProfessor(scanner.nextLine());

        // c) Novo conteúdo
        System.out.println("\nNovo conteúdo dos atributos:");
        System.out.println("Nome: " + disciplina.getNome());
        System.out.println("Carga Horária: " + disciplina.getCargaHoraria());
        System.out.println("Professor: " + disciplina.getNomeProfessor());

        scanner.close();
    }
}
