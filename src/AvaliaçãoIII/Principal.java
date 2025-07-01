package AvaliaçãoIII;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        CadastroVeiculos cadasVec = new CadastroVeiculos();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar veículo");
            System.out.println("2 - Alterar quilometragem");
            System.out.println("3 - Excluir veículo");
            System.out.println("4 - Listar veículos");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Placa: ");
                    String placa = sc.nextLine();

                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();

                    System.out.print("Marca: ");
                    String marca = sc.nextLine();

                    System.out.print("Ano de fabricação: ");
                    int ano = sc.nextInt();

                    System.out.print("Quilometragem: ");
                    double km = sc.nextDouble();

                    sc.nextLine();
                    cadasVec.cadastrar(new Veiculo(placa, modelo, marca, ano, km));
                    break;
                case 2:
                    System.out.print("Digite a placa: ");
                    String p1 = sc.nextLine();
                    System.out.print("Nova KM: ");
                    double novaKm = sc.nextDouble();
                    sc.nextLine();
                    if (cadasVec.alterar(p1, novaKm)) {
                        System.out.println("Quilometragem atualizada.");
                    } else {
                        System.out.println("Veículo não encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Digite a placa: ");
                    String p2 = sc.nextLine();
                    if (cadasVec.excluir(p2)) {
                        System.out.println("Veículo excluído.");
                    } else {
                        System.out.println("Veículo não encontrado.");
                    }
                    break;
                case 4:
                    cadasVec.listar();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
