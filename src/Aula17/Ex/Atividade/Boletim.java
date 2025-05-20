package Aula17.Ex.Atividade;

class Boletim {
    public static void imprimirStatus(Aluno3 a) {
        if (a.getNotaFinal() >= 6) {
            System.out.println(a.getNome() + " foi aprovado.");
        } else {
            System.out.println(a.getNome() + " foi reprovado.");
        }
    }
}