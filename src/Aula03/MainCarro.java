import java.util.Scanner;

// Classe executável para Carro
public class MainCarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Primeiro Carro
        System.out.print("Digite a marca do primeiro carro: ");
        String marca1 = scanner.nextLine();
        System.out.print("Digite o modelo do primeiro carro: ");
        String modelo1 = scanner.nextLine();
        System.out.print("Digite o ano de fabricação do primeiro carro: ");
        int ano1 = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha

        Carro carro1 = new Carro(marca1, modelo1, ano1);

        // Segundo Carro
        System.out.print("Digite a marca do segundo carro: ");
        String marca2 = scanner.nextLine();
        System.out.print("Digite o modelo do segundo carro: ");
        String modelo2 = scanner.nextLine();
        System.out.print("Digite o ano de fabricação do segundo carro: ");
        int ano2 = scanner.nextInt();

        Carro carro2 = new Carro(marca2, modelo2, ano2);

        // Exibir informações
        System.out.println("\nInformações dos Carros:");
        carro1.exibirInformacoes();
        carro2.exibirInformacoes();
    }
}