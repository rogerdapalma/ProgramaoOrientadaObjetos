package Aula21;

public class Aluno {
    private String nome;
    private int idade;

    public Aluno(String nome,int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    /*
    public void exibirDados(){
        System.out.println("Nome: " + nome + "\nIdade: " + idade);
    }*/
}
