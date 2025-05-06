package Aula16.Ex006;

class Gerente extends Funcionario {
    private double bonusAnual;

    public Gerente(String nome, double salario, double bonusAnual) {
        super(nome, salario);
        this.bonusAnual = bonusAnual;
    }

    @Override
    public void aumentarSalario(double percentual) {
        salario += salario * (percentual / 100) + bonusAnual;
    }

    @Override
    public String toString() {
        return "Gerente: " + nome + ", Salario: R$" + String.format("%.2f", salario) + ", Bonus: R$" + String.format("%.2f", bonusAnual);
    }
}

