package Aula16.Ex013;


class Conta {
    private int numero;
    private String titular;
    private double saldo;

    public Conta(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta Nº: " + numero + ", Titular: " + titular + ", Saldo: R$" + String.format("%.2f", saldo);
    }
}
