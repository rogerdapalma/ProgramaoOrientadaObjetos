package Aula06.Ex004;

class Main {
    public static void main(String[] args) {
        ContaCorrente novaConta = new ContaCorrente();

        novaConta.definirSaldoInicial(1000f);
        System.out.println("Saldo inicial: R$" + novaConta.getSaldo());

        novaConta.sacar(500f);
        novaConta.depositar(50f);
        System.out.println("Saldo após saque de 500 e depósito de 50: R$" + novaConta.getSaldo());

        novaConta.sacar(600f);
        System.out.println("Saldo final: R$" + novaConta.getSaldo());
    }
}
