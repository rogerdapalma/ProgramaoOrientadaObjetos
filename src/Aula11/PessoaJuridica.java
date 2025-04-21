package Aula11;

public class PessoaJuridica extends Pessoa {
    protected String Cnpj;
    protected String socio;
    protected String dtAbertura;


    public PessoaJuridica(String nome, int idade, String Cnpj, String socio) {
        super(nome, idade);
        this.Cnpj = Cnpj;
        this.socio = socio;

    }
}
