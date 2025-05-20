package Aula18.Atividade.Ex001;

public class Main {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(1000, 500);
        conta.depositar(200);
        conta.sacar(300);

        Animal cachorro = new Cachorro("Rex", 5);
        Animal gato = new Gato("Mimi", 3);
        cachorro.emitirSom();
        gato.emitirSom();

        Conta investimento = new ContaInvestimento(5000, 1000);
        investimento.depositar(1000);
        investimento.sacar(600);

        Veiculo carro = new Carro("Toyota", "Corolla", 2020);
        carro.acelerar();
        carro.frear();

        Veiculo moto = new Moto("Honda", "CB500", 2022);
        moto.acelerar();
        moto.frear();

        Pessoa pf = new PessoaFisica("João", "São Paulo", "123.456.789-00");
        Pessoa pj = new PessoaJuridica("Empresa X", "Rio", "12.345.678/0001-99");
        pf.efetuarCompra();
        pj.efetuarCompra();

        Funcionario gerente = new Gerente("Carlos", 10000);
        Funcionario vendedor = new Vendedor("Ana", 5000);
        gerente.calcularSalario();
        vendedor.calcularSalario();

        BancoDeDados bd = new BancoDeDados();
        bd.conectar();
        bd.inserir();
        bd.atualizar();
        bd.excluir();
        bd.desconectar();
    }
}
