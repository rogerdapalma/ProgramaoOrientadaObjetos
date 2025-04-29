package Aula14.ex001;

public class Sobrecarga {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(10, 20);
        int resultado2 = calculadora.somar(30, 10,50);
        System.out.println("Resultado: " + resultado);
        System.out.println("segundo resultado : "+resultado2);
        double resultado3 = calculadora.somar(3,7);
        System.out.printf("Resultado: "+ resultado3);
        double resultado4 = calculadora.somar(3.5,7);
        System.out.printf("Resultado: "+ resultado3);
        int resultado5 = calculadora.multiplicar(3,7);
    }
}
