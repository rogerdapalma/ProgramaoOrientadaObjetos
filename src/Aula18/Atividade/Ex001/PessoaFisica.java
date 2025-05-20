package Aula18.Atividade.Ex001;

class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, String cidade, String cpf) {
        super(nome, cidade);
        this.cpf = cpf;
    }

    public void efetuarCompra() {
        System.out.println(nome + " (CPF: " + cpf + ") realizou uma compra.");
    }
}