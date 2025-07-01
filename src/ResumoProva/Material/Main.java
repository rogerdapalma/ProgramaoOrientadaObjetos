package ResumoProva.Material;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciadorCarros gm = new GerenciadorCarros();

        while (true) {
            System.out.println("\n1 - Cadastrar carro");
            System.out.println("2 - Listar carros");
            System.out.println("3 - Sair");
            System.out.print("Escolha: ");
            int op = sc.nextInt(); sc.nextLine();

            if (op == 1) {
                try {
                    System.out.print("Placa: "); String placa = sc.nextLine();
                    System.out.print("Ano: "); int ano = sc.nextInt(); sc.nextLine();
                    System.out.print("Modelo: "); String modelo = sc.nextLine();
                    System.out.print("Quilometragem: "); double km = sc.nextDouble(); sc.nextLine();

                    Carro c = new Carro(placa, ano, modelo, km);
                    gm.adicionar(c);
                    System.out.println("Carro cadastrado!");

                } catch (QuilometragemInvalidaException e) {
                    System.out.println("Erro ao cadastrar: " + e.getMessage());
                }
            } else if (op == 2) {
                gm.listar();
            } else if (op == 3) {
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }

        sc.close();
    }
}