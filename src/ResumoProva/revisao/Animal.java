package ResumoProva.revisao;

abstract class Animal {
    private String especie;
    private int idade;

    public Animal(String especie, int idade) {
        this.especie = especie;
        this.idade = idade;
    }
    public String getEspecie() {
        return especie;
    }
    public int getIdade() {
        return idade;
    }

    abstract void emitirSom();
}
