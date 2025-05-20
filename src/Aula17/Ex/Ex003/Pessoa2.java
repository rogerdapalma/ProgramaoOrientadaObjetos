package Aula17.Ex.Ex003;

import java.util.ArrayList;
import java.util.List;

class Pessoa2 {
    private String nome;
    private int idade;
    private char sexo;

    public Pessoa2(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public char getSexo() {
        return sexo;
    }
}