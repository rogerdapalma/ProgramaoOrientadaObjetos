package Aula13;

import Aula13.Ex01.Retangulo;
import Aula13.Ex02.Funcionario;
import Aula13.Ex03.PessoaComplexa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ex. 1
        Retangulo ret = new Retangulo("Azul", true, 4.0, 5.0);
        System.out.println("\nEx.1 - Area do retangulo: " + ret.calcularArea());
        // Ex. 2
        Funcionario func = new Funcionario("João");
        func.trabalhar();

        // Ex. 3
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o tipo: ");
        String tipo = scanner.nextLine();

        PessoaComplexa pessoa = new PessoaComplexa(nome, idade, tipo);
        System.out.println("\nNome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.idade);
        System.out.println("Tipo: " + pessoa.tipo);
        System.out.println("Falar: " + pessoa.falar());
        pessoa.andar();

        scanner.close();
    }
}
