package Aula07;

import java.util.Scanner;

class CalculadoraApp {
    public void executar() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Digite o primeiro número: ");
            double a = Double.parseDouble(scanner.nextLine());

            System.out.print("Digite o segundo número: ");
            double b = Double.parseDouble(scanner.nextLine());

            System.out.print("Digite a operação (+, -, *, /): ");
            String op = scanner.nextLine();

            double resultado;
            switch (op) {
                case "+": resultado = Calculadora.somar(a, b); break;
                case "-": resultado = Calculadora.subtrair(a, b); break;
                case "*": resultado = Calculadora.multiplicar(a, b); break;
                case "/": resultado = Calculadora.dividir(a, b); break;
                default: throw new IllegalArgumentException("Operação inválida.");
            }
            System.out.println("Resultado: " + resultado);
        } catch (NumberFormatException e) {
            System.out.println("Erro: valor inválido digitado.");
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}