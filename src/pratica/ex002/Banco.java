package pratica.ex002;

public class Banco {
    public static void main(String[] args) {
        try {
            Conta c1 = new ContaCorrente("João", 1000.0);
            Conta c2 = new ContaPoupanca("Maria", 500.0);

            System.out.println(c1);
            System.out.println(c2);

            c1.depositar(200);
            c2.sacar(100);

            System.out.println("\nApós operações:");
            System.out.println(c1);
            System.out.println(c2);

            System.out.println("\nTributo conta corrente:");
            Tributavel t = (Tributavel) c1;
            System.out.println("R$" + t.calcularTributo());

            // Testar erro
            c2.sacar(1000);

        } catch (OperacaoInvalidaException e) {
            System.out.println("Erro na operação: " + e.getMessage());
        }
    }
}