package Aula18.Atividade.Ex001;

public class ContaBancaria extends Conta {
    public ContaBancaria(double saldo, double limite) {
        super();
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado. Novo saldo: R$" + this.saldo);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= (saldo + limite)) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Novo saldo: R$" + this.saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
