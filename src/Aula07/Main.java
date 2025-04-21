package Aula07;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Raiz Quadrada ===");
        new RaizQuadradaApp().executar();

        System.out.println("\n=== Calculadora ===");
        new CalculadoraApp().executar();

        System.out.println("\n=== Conversor de String para Double ===");
        Conversor.conversaoTeste();

        System.out.println("\n=== Testando Excecoes ===");
        Excecao.testar();
    }
}