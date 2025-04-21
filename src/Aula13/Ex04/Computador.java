package Aula13.Ex04;

public class Computador {
    protected String marca;
    protected String modelo;

    public Computador(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}
