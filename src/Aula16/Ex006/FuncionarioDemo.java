package Aula16.Ex006;

public class FuncionarioDemo {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[3];

        funcionarios[0] = new Gerente("Ana", 8000.0, 2000.0);
        funcionarios[1] = new Desenvolvedor("Carlos", 5000.0, 10);
        funcionarios[2] = new Desenvolvedor("Beatriz", 5500.0, 15);

        for (Funcionario f : funcionarios) {
            f.aumentarSalario(10); // aumento de 10%
        }

        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }
}
