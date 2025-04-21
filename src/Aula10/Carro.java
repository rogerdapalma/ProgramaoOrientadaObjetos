package Aula10;

public class Carro {

    private String nome;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public void exibirMensagem(){
        System.out.println("Classe carro");
        System.out.println("Nome: " + nome);
    }

}
