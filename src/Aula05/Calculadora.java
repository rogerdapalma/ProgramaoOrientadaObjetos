package Aula05;

public class Calculadora {
    public double n1;
    public double n2;

    public double somar(){
        double resultado;
        resultado = n1 + n2;
        System.out.println(n1+ " + "+ n2 + " = " + resultado);
        return resultado;

    }
    public void multiplicar(){
        double resultado;
        resultado = n1 * n2;
        System.out.println(n1+ " * "+ n2 + " = " + resultado);
        System.out.println("resultado da multiplicacao " + resultado);
    }
    public void dividir(double n1, double n2){
        double resultado;
        resultado = n1 / n2;
        System.out.println(n1+ " / "+ n2 + " = " + resultado);
        System.out.println("resultado da divisao " + resultado);
    }

    public double subtrair(double v, double v1) {
        return v;
    }
    //public void subtrair(double n1, double n2){
    //double resultado;
    //    resultado = n1 - n2;
    //    System.out.println(n1+ " - "+ n2 + " = " + resultado);

   // }
}
