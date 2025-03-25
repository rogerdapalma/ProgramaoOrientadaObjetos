package Aula06.Ex004;

public class ContaCorrente {
    private float saldo;

    public void definirSaldoInicial(float valor) {
        this.saldo = valor;
    }

    public void depositar(float valor) {
        this.saldo += valor;
    }

    public boolean sacar(float valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque de R$" + valor);
            return false;
        } else {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            return true;
        }
    }

    public float getSaldo() {
        return this.saldo;
    }
}