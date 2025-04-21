package Aula13.Ex03;

public class SerHumano extends Animal {
    public String nome;
    public int idade;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public SerHumano(String nome, int idade, String tipo) {
        super(tipo);
        this.nome = nome;
        this.idade = idade;
    }

    public String falar() {
        return "Nem todos falam";
    }
}
