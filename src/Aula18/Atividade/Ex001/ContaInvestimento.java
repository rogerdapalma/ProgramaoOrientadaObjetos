package Aula18.Atividade.Ex001;

class ContaInvestimento extends ContaBancaria {
    public ContaInvestimento(double saldo, double limite) {
        super(saldo, limite);
        System.out.println("Conta Investimento criada.");
    }
}