package Aula09;

import java.util.ArrayList;
import java.util.Scanner;

class Tarefa {
    private String descricao;
    private boolean concluida = false;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public void concluirTarefa() {
        concluida = true;
    }

    public void exibirTarefa() {
        System.out.println(descricao + " - " + (concluida ? "Concluída" : "Pendente"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Tarefa> tarefas = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a descrição da tarefa " + (i + 1) + ":");
            String desc = scanner.nextLine();
            tarefas.add(new Tarefa(desc));
        }

        // Marca segunda tarefa como concluída
        tarefas.get(1).concluirTarefa();
        tarefas.get(2).concluirTarefa();

        for (Tarefa t : tarefas) {
            t.exibirTarefa();
        }
    }
}
