package Aula18;

public class Cachorro extends Animal{

    private String raca;

    public Cachorro(String especie, int idade, String raca) {
        super(especie, idade);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Cachorro [raca=" + raca + ", especie=" + getEspecie() + ", idade=" + getIdade() + "]";
    }

    @Override
    void emitirSom() {
        System.out.println("au au");
    }

    public void cuidarPatio() {
        System.out.println("Cuidando patio....");
    }

}