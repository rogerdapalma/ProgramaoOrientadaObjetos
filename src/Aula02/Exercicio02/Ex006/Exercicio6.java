package Ex006;

import java.util.Scanner;

// Exercício 6 - Ler nomes e populações de 5 cidades e encontrar a mais populosa
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cidades = new String[5];
        int[] populacoes = new int[5];
        int maiorPopulacao = 0;
        String cidadeMaisPopulosa = "";
        
        System.out.println("Digite os nomes e populações de 5 cidades:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Cidade " + (i + 1) + ": ");
            cidades[i] = scanner.next();
            System.out.print("População: ");
            populacoes[i] = scanner.nextInt();
            if (populacoes[i] > maiorPopulacao) {
                maiorPopulacao = populacoes[i];
                cidadeMaisPopulosa = cidades[i];
            }
        }
        System.out.println("A cidade mais populosa é: " + cidadeMaisPopulosa);
    }
}