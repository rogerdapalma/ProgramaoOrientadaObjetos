package Aula16.Ex011;

class Pessoa {
    private String nome;
    private int idade;
    private char sexo; // 'M' para masculino, 'F' para feminino

    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public char getSexo() {
        return sexo;
    }
}