package Aula16.Ex006;

class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double percentual) {
        salario += salario * (percentual / 100);
    }

    @Override
    public String toString() {
        return "Funcionario: " + nome + ", Salario: R$" + String.format("%.2f", salario);
    }
}
