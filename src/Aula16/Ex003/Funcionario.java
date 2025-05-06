package Aula16.Ex003;

class Funcionario {
    protected double salarioBase;

    public Funcionario(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void calcularSalario() {
        System.out.printf("Salário base: R$ %.2f\n", salarioBase);
    }
}