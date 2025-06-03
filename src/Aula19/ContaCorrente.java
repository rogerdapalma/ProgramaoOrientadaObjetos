package Aula19;

public class ContaCorrente extends Conta3 {

    public ContaCorrente(double saldo, double limite) {
        super(saldo, limite);
    }

    @Override
    public void depositar(double valor) {
        if (valor < 0) {
            throw new ValorNegativoException("Valor do depósito não pode ser negativo.");
        }
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if (valor < 0) {
            throw new ValorNegativoException("Valor do saque não pode ser negativo.");
        }
        if (valor > saldo + limite) {
            throw new SaldoInsuficienteException("Saldo insuficiente para o saque.");
        }
        saldo -= valor;
    }

    // exceções internas
    public static class ValorNegativoException extends RuntimeException {
        public ValorNegativoException(String message) {
            super(message);
        }
    }

    public static class SaldoInsuficienteException extends RuntimeException {
        public SaldoInsuficienteException(String message) {
            super(message);
        }
    }
}