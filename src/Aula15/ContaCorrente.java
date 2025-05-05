package Aula15;

class ContaCorrente extends ContaBancaria {
    private double saldo;
    private double limite;

    public ContaCorrente(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    @Override
    public void calcularSaldo() {
        double total = saldo + limite;
        System.out.println("Saldo da conta corrente: R$ " + total);
    }
}
