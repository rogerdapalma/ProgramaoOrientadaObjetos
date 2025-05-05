package Aula15;

public class Main {
    public static void main(String[] args) {
        Triangulo t = new Triangulo(10, 5);
        t.calcularArea();

        ContaCorrente cc = new ContaCorrente(1000, 500);
        cc.calcularSaldo();

        Pessoa p = new Pessoa();
        p.falar("Olá, mundo!");
        p.falar("Repetindo...", 3);

        Casa c = new Casa();
        System.out.println("Preço da casa: R$ " + c.calcularPreco(100));
        System.out.println("Preço da casa com quartos: R$ " + c.calcularPreco(100, 3));
    }
}
