package Ex008;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int pares = 0, impares = 0;
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Quantidade de Numeros pares: " + pares);
        System.out.println("Quantidade de Numeros impares: " + impares);
    }
}
