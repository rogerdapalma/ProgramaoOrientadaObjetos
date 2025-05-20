package Aula17.Ex.Ex002;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Aluno2> alunos = new ArrayList<>();
        alunos.add(new Aluno2("Ana", 7.0, 8.5));
        alunos.add(new Aluno2("Carlos", 5.5, 4.0));
        alunos.add(new Aluno2("Beatriz", 6.0, 6.0));

        for (Aluno2 aluno : alunos) {
            double media = aluno.calcularMedia();
            if (media >= 6) {
                System.out.println(aluno.getNome() + " foi aprovado com média " + media);
            } else {
                System.out.println(aluno.getNome() + " foi reprovado com média " + media);
            }
        }
    }
}
