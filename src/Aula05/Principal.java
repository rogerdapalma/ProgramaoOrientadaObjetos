package Aula05;

public class Principal {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.n1 = 7.14;
        calc.n2 = 8.23;

        double retorno;
        retorno = calc.somar();
        System.out.println("resultado da soma " + retorno);
        System.out.println("resultado da soma2 " +calc.somar());

        calc.multiplicar();
        calc.dividir(10,20);


        retorno = calc.subtrair(5.44 , 2.17);
        System.out.println("resultado da subrais " + retorno);
    }
}
