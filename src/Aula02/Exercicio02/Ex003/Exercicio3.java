package Ex003;


import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];
        double soma = 0;
        System.out.println("Digite as notas de 5 alunos:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }
        double media = soma / 5;
        System.out.println("Média das notas: " + media);
    }
}