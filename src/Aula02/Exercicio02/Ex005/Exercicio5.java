package Ex005;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        int maior = numeros[0], menor = numeros[0];
        for (int num : numeros) {
            if (num > maior) maior = num;
            if (num < menor) menor = num;
        }
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }
}