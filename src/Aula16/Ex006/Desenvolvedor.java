package Aula16.Ex006;

class Desenvolvedor extends Funcionario {
    private int horasExtras;

    public Desenvolvedor(String nome, double salario, int horasExtras) {
        super(nome, salario);
        this.horasExtras = horasExtras;
    }

    @Override
    public String toString() {
        return "Desenvolvedor: " + nome + ", Salario: R$" + String.format("%.2f", salario) + ", Horas Extras: " + horasExtras;
    }
}
