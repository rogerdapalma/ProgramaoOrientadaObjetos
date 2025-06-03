package Aula19;

public class ContaBancaria {
    public static void main(String[] args) {
        Conta3 conta = new ContaCorrente(1000.0, 500.0);

        try {
            conta.depositar(200.0);
            conta.sacar(300.0);
            conta.sacar(-50.0); // vai lançar exceção
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("Saldo final: R$ " + conta.getSaldo());
    }
}
