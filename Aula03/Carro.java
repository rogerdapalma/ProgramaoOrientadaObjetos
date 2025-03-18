import java.util.Scanner;

// Classe Carro
class Carro {
    String marca;
    String modelo;
    int anoFabricacao;

    public Carro(String marca, String modelo, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + anoFabricacao);
    }
}
