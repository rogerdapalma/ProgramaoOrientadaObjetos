package Aula18.Atividade.Ex001;

abstract class Pessoa {
    protected String nome;
    protected String cidade;

    public Pessoa(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public abstract void efetuarCompra();
}
