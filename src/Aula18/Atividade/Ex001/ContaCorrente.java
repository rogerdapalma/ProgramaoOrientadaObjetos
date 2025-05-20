package Aula18.Atividade.Ex001;

class ContaCorrente extends ContaBancaria {
    public ContaCorrente(double saldo, double limite) {
        super(saldo, limite);
        System.out.println("Conta Corrente criada.");
    }
}
