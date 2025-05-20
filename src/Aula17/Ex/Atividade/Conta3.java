package Aula17.Ex.Atividade;

class Conta3 {
    private String titular;
    private double saldo;

    public Conta3(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public String toString() {
        return "Titular: " + titular + ", Saldo: R$" + saldo;
    }
}
