package Aula21.Serialização.Ex002;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        super();
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
    }
}
