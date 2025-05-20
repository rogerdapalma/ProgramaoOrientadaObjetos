package Aula18.Atividade.Ex001;

class Carro extends Veiculo {
    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    public void acelerar() { System.out.println("Carro acelerando..."); }
    public void frear() { System.out.println("Carro freando..."); }
}