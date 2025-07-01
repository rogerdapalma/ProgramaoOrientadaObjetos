package pratica.ex002;

abstract class Conta {
    private String titular;
    private double saldo;

    public Conta(String titular, double saldoInicial) throws OperacaoInvalidaException {
        this.titular = titular;
        depositar(saldoInicial); // garante regra do deposito
    }

    public void depositar(double valor) throws OperacaoInvalidaException {
        if (valor < 0) {
            throw new OperacaoInvalidaException("Não é permitido depositar valor negativo.");
        }
        this.saldo += valor;
    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if (valor < 0) {
            throw new OperacaoInvalidaException("Não é permitido sacar valor negativo.");
        }
        if (valor > saldo) {
            throw new OperacaoInvalidaException("Saldo insuficiente.");
        }
        this.saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return titular + " - Saldo: R$" + saldo;
    }
}