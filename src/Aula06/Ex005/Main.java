package Aula06.Ex005;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual construtor deseja utilizar?\n1 - Nome e Idade\n2 - Apenas Idade");
        int opcao = scanner.nextInt();
        scanner.nextLine(); // limpa buffer

        if (opcao == 1) {
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();
            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();
            new Pessoa(nome, idade);
        } else if (opcao == 2) {
            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();
            new Pessoa(idade);
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
