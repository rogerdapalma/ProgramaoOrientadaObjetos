package Ex007;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] notas = new double[3][4];
        System.out.println("Digite as notas de 3 alunos em 4 disciplinas:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Nota do aluno " + (i + 1) + " na disciplina " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("Nota mais alta e mais baixa por disciplina:");
        for (int j = 0; j < 4; j++) {
            double maiorNota = notas[0][j];
            double menorNota = notas[0][j];
            for (int i = 0; i < 3; i++) {
                if (notas[i][j] > maiorNota) maiorNota = notas[i][j];
                if (notas[i][j] < menorNota) menorNota = notas[i][j];
            }
            System.out.println("Disciplina " + (j + 1) + " - Maior nota: " + maiorNota + ", Menor nota: " + menorNota);
        }
    }
}