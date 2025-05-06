package Aula16.Ex013;

import java.util.ArrayList;
import java.util.List;

public class ContaDemo {
    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();

        contas.add(new Conta(101, "Ana", 2500.00));
        contas.add(new Conta(102, "Bruno", 3200.75));
        contas.add(new Conta(103, "Carlos", 1800.50));

        Conta maiorSaldo = encontrarContaMaiorSaldo(contas);
        System.out.println("Conta com maior saldo:");
        System.out.println(maiorSaldo);
    }

    public static Conta encontrarContaMaiorSaldo(List<Conta> contas) {
        if (contas.isEmpty()) return null;

        Conta maior = contas.get(0);
        for (Conta c : contas) {
            if (c.getSaldo() > maior.getSaldo()) {
                maior = c;
            }
        }
        return maior;
    }
}
