package Aula21.Serialização.Ex001;

import java.io.Serializable;

public class Produto implements Serializable {
    private String codigo;
    private String nome;
    private double preco;
    private transient String temporario;

    public Produto(String codigo, String nome, double preco, String casoTemporario) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public  String getCodigo() {
        return codigo;
    }
    public  String getNome() {
        return nome;
    }
    public  double getPreco() {
        return preco;
    }
    @Override
    public String toString() {
        return "produto [codgio=" + codigo + ", nome=" + nome + ", preco=" + preco + "]";
    }
}
