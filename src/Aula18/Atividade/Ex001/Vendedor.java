package Aula18.Atividade.Ex001;

class Vendedor extends Funcionario {
    public Vendedor(String nome, double salario) { super(nome, salario); }
    public void calcularSalario() {
        System.out.printf("Salário do vendedor %s: R$%.2f\n", nome, salario * 1.1);
    }
}