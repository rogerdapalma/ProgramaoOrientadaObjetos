package Aula04;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Carro c = new Carro();
        System.out.println("Digite marca do carro: ");
        c.marca = teclado.nextLine();
        System.out.println("Digite modelo: ");
        c.modelo = teclado.nextLine();
        c.exibirDados();
        c.alugar();
        c.alugar();
        c.alugar();
        c.alugar();
        c.alugar();
        c.exibirDados();
        c.devolver();
        c.devolver();
        c.devolver();
        c.devolver();
        c.devolver();
        c.exibirDados();


    }

}
