package Aula09;

import java.util.Scanner;

class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibirInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade: " + quantidade);
    }

    public double calcularValorTotal() {
        return preco * quantidade;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Produto com entrada via teclado
        System.out.println("Digite o nome do produto:");
        String nome = scanner.nextLine();
        System.out.println("Digite o preço do produto:");
        double preco = scanner.nextDouble();
        System.out.println("Digite a quantidade:");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        Produto produto1 = new Produto(nome, preco, quantidade);
        Produto produto2 = new Produto("Caderno", 15.50, 10);

        produto1.exibirInformacoes();
        System.out.println("Valor total: R$" + produto1.calcularValorTotal());
        System.out.println();
        produto2.exibirInformacoes();
        System.out.println("Valor total: R$" + produto2.calcularValorTotal());
    }
}