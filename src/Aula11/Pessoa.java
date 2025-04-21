package Aula11;

public class Pessoa {
    protected String nome;
    protected int idade;
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirdados(){
        System.out.println("Nome: " + nome + "\nIdade: " + idade);
    }
}
