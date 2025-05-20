package Aula17.Ex.Ex005;

class Conta2 {
    private int numero;
    private String titular;
    private double saldo;

    public Conta2(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta Nº: " + numero + ", Titular: " + titular + ", Saldo: R$" + saldo;
    }
}
