package Aula10;

public class Onibus extends Carro{ // classe onibus extende carro
    // herda tudo que tem na classe carro
    protected String Modelo;

    public String getModelo(){
        return Modelo;
    }
    public void setModelo(String Modelo){
        this.Modelo = Modelo;
    }
}
