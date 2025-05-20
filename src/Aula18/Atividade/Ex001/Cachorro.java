package Aula18.Atividade.Ex001;

class Cachorro extends Animal {
    public Cachorro(String nome, int idade) { super(nome, idade); }
    public void emitirSom() {
        System.out.println("Au Au!");
    }
}