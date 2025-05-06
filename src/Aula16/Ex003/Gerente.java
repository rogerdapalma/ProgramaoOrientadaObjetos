package Aula16.Ex003;

class Gerente extends Funcionario {
    private double bonus;

    public Gerente(double salarioBase, double bonus) {
        super(salarioBase);
        this.bonus = bonus;
    }

    @Override
    public void calcularSalario() {
        double salarioTotal = salarioBase + bonus;
        System.out.printf("Salário com bônus: R$ %.2f\n", salarioTotal);
    }

    public static void main(String[] args) {
        Gerente gerente = new Gerente(5000.0, 1200.0);
        gerente.calcularSalario();
    }
}
