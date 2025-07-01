package pratica.ex002;

class ContaCorrente extends Conta implements Tributavel {
    public ContaCorrente(String titular, double saldoInicial) throws OperacaoInvalidaException {
        super(titular, saldoInicial);
    }

    @Override
    public double calcularTributo() {
        return getSaldo() * 0.01; // 1% do saldo
    }
}