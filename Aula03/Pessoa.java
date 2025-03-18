import java.util.Scanner;
// Classe Pessoa
class Pessoa {
    String nome;
    int idade;
    String genero;

    public Pessoa(String nome, int idade, String genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Idade: " + idade + ", Gênero: " + genero);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha
        System.out.print("Digite o gênero da pessoa: ");
        String genero = scanner.nextLine();

        Pessoa pessoa = new Pessoa(nome, idade, genero);

        System.out.println("\nInformações da Pessoa:");
        pessoa.exibirInformacoes();
    }
}