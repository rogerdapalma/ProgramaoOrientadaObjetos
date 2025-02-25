package Ex004;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] notasAlunos = new double[3][4];
        System.out.println("Digite as notas de 3 alunos em 4 disciplinas:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Nota do aluno " + (i + 1) + " na disciplina " + (j + 1) + ": ");
                notasAlunos[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("Média por disciplina:");
        for (int j = 0; j < 4; j++) {
            double somaDisciplina = 0;
            for (int i = 0; i < 3; i++) {
                somaDisciplina += notasAlunos[i][j];
            }
            System.out.println("Disciplina " + (j + 1) + ": " + (somaDisciplina / 3));
        }
    }
}