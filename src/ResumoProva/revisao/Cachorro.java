package ResumoProva.revisao;

class Cachorro extends Animal implements Cuidador {
    private String raca;

    public Cachorro(String especie, int idade, String raca) {
        super(especie, idade);
        this.raca = raca;
    }

    @Override
    public void cuidar() {
        System.out.println("Cuidando de cachorro....");
    }

    @Override
    void emitirSom() {
        System.out.println("Au au");
    }
    public void exibeDados(){
        System.out.println("especie: " + getEspecie() + ", idade: " + getIdade() + ", raca: " + raca );
    }

}
