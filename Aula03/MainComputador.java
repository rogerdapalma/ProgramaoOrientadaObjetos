import java.util.Scanner;
// Classe executável para Computador
class MainComputador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Primeiro Computador com entrada do usuário
        System.out.print("Digite a marca do primeiro computador: ");
        String marca1 = scanner.nextLine();
        System.out.print("Digite o modelo do primeiro computador: ");
        String modelo1 = scanner.nextLine();
        System.out.print("Digite o tipo do primeiro computador: ");
        String tipo1 = scanner.nextLine();
        System.out.print("Digite o preço do primeiro computador: ");
        double preco1 = scanner.nextDouble();

        Computador comp1 = new Computador(marca1, modelo1, tipo1, preco1);

        // Segundo Computador com valores pré-definidos
        Computador comp2 = new Computador("Dell", "Inspiron 15", "Notebook", 3500.00);

        // Exibir informações
        System.out.println("\nInformações dos Computadores:");
        comp1.exibirInformacoes();
        comp2.exibirInformacoes();
    }
}
