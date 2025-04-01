package Aula07;

class Excecao {
    public static void testar() {
        // Explicação das principais exceções
        System.out.println("\nPrincipais exceções:");
        System.out.println("- NumberFormatException: valor inválido ao converter string para número.");
        System.out.println("- InputMismatchException: entrada inesperada para tipo esperado (com Scanner).");
        System.out.println("- ArithmeticException: erro aritmético (ex: divisão por zero).");
        System.out.println("- NullPointerException: tentativa de acessar um objeto nulo.");
        System.out.println("- ArrayIndexOutOfBoundsException: acesso inválido a posição de array.");

        // Testes
        try {
            System.out.println("\nTestando divisão por zero...");
            double x = Calculadora.dividir(5, 0);
        } catch (ArithmeticException e) {
            System.out.println("Capturada: " + e);
        }

        try {
            System.out.println("\nTestando conversão de string inválida...");
            double valor = Double.parseDouble("abc");
        } catch (NumberFormatException e) {
            System.out.println("Capturada: " + e);
        }
    }
}
