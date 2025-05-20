package Aula18.Atividade.Ex001;

class Gerente extends Funcionario {
    public Gerente(String nome, double salario) { super(nome, salario); }
    public void calcularSalario() {
        System.out.printf("Salário do gerente %s: R$%.2f\n", nome, salario * 1.2);
    }
}