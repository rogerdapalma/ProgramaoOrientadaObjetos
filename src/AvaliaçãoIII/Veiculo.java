package AvaliaçãoIII;

import java.io.Serializable;

public class Veiculo implements Serializable {
    private String placa;
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private double quilometragem;

    public Veiculo(String placa, String marca, String modelo, int ano, double quilometragem) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = ano;
        this.quilometragem = quilometragem;
    }

    public String getPlaca() {
        return placa;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    public double getQuilometragem() {
        return quilometragem;
    }
    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }
    @Override
    public String toString() {
        return "Placa: " + placa + ", Modelo: " + modelo + ", Marca: " + marca +
                " Ano: " + anoFabricacao + " KM: " + quilometragem;
    }
}

