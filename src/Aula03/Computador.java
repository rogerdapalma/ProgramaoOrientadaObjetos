import java.util.Scanner;
// Classe Computador
class Computador {
    String marca;
    String modelo;
    String tipo;
    double preco;

    public Computador(String marca, String modelo, String tipo, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.preco = preco;
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Tipo: " + tipo + ", Preço: R$" + preco);
    }
}