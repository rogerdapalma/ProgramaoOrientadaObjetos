package Aula16.Ex004;

class ContaBancaria {
    private double saldo;

    public ContaBancaria() {
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.printf("Depósito em dinheiro: R$ %.2f | Saldo atual: R$ %.2f\n", valor, saldo);
    }

    public void depositar(Cheque cheque) {
        double valor = cheque.getValor();
        saldo += valor;
        System.out.printf("Depósito via cheque: R$ %.2f | Saldo atual: R$ %.2f\n", valor, saldo);
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(300.0);

        Cheque cheque = new Cheque(500.0);
        conta.depositar(cheque);
    }
}