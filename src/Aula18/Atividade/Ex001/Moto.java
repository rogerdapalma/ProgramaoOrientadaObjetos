package Aula18.Atividade.Ex001;

class Moto extends Veiculo {
    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    public void acelerar() { System.out.println("Moto acelerando..."); }
    public void frear() { System.out.println("Moto freando..."); }
}
