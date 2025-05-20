package Aula18;

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

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String toString() {
        return "Animal [especie=" + especie + ", idade=" + idade + "]";
    }

    abstract void emitirSom();

}