package Aula18.Atividade.Ex001;

class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String nome, String cidade, String cnpj) {
        super(nome, cidade);
        this.cnpj = cnpj;
    }

    public void efetuarCompra() {
        System.out.println(nome + " (CNPJ: " + cnpj + ") realizou uma compra.");
    }
}