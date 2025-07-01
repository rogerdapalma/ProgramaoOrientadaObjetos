package ResumoProva.revisao;

import java.io.Serializable;

class Cliente implements Serializable {
    private String nome;
    private int idade;

    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return nome + " - " + idade + " anos";
    }
}
