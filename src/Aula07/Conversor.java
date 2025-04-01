package Aula07;

import java.util.Scanner;

class Conversor {
    public static double converterParaDouble(String valor) {
        return Double.parseDouble(valor);
    }

    public static void conversaoTeste() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número (ponto flutuante): ");
        String entrada = scanner.nextLine();
        try {
            double resultado = converterParaDouble(entrada);
            System.out.println("Valor convertido: " + resultado);
        } catch (NumberFormatException e) {
            System.out.println("Erro: não foi possível converter para double.");
        }
    }
 }
