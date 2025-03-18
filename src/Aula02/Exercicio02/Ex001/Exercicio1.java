package Ex001;

import java.util.Scanner;

// Exercício 1 - Ler e imprimir 5 nomes
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];
        System.out.println("Digite 5 nomes:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }
        System.out.println("Nomes digitados:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}