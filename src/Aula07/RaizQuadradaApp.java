package Aula07;

import java.util.Scanner;

class RaizQuadradaApp {
    public void executar() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Digite um número inteiro: ");
            int numero = Integer.parseInt(scanner.nextLine());
            System.out.println("Raiz quadrada: " + Math.sqrt(numero));
        } catch (NumberFormatException e) {
            System.out.println("Erro: entrada inválida. Digite um número inteiro.");
        }
    }
}
