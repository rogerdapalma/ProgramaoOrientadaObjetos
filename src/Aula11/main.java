package Aula11;

public class main {

    public static void main(String[] args){
        Pessoa p = new Pessoa("ricardo",40);
        p.exibirdados();
        PessoaJuridica pj = new PessoaJuridica("Ricoardo",40,"020202020","casas");
        pj.exibirdados();
        System.out.println("cnpj"+ pj.Cnpj);


    }
}
