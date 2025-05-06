package Aula16.Ex010;
import java.util.ArrayList;
import java.util.List;

public class AlunoDemo {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Ana", 7.5, 8.0));
        alunos.add(new Aluno("Bruno", 5.0, 4.5));
        alunos.add(new Aluno("Carla", 6.0, 6.0));

        for (Aluno a : alunos) {
            double media = a.calcularMedia();
            System.out.print("Aluno: " + a.getNome() + " - Média: " + String.format("%.2f", media) + " - ");
            if (media >= 6.0) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        }
    }
}
