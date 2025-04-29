package Aula14.ex001;

import java.security.PublicKey;

public class Calculadora {
    public int somar(int a, int b) {

        System.out.println("fui INTEIRO");
        return a + b;

    }
    public int somar(int a, int b, int c) {

        System.out.println("fui INTEIRO COM 3 ");
        return a + b + c;
    }
    public double somar(double a, double b) {

        System.out.println("fui BOUBLE");
        return a + b;
    }

    public int multiplicar(int a, int b) {
        System.out.println("  fui multiplicado");
        return a * b;
    }
    public double multiplicar(double a, double b) {
        System.out.println("fui multiplicado");
        return a * b;
    }
}
