package Aula17.Ex.Ex005;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n--- Conta com maior saldo ---");

        List<Conta2> contas = new ArrayList<>();
        contas.add(new Conta2(213, "Ana", 2500.0));
        contas.add(new Conta2(231, "Bruno", 4200.5));
        contas.add(new Conta2(444, "Carlos", 1800.75));

        Conta2 maiorSaldo = encontrarContaMaiorSaldo(contas);
        System.out.println(maiorSaldo);
    }

    public static Conta2 encontrarContaMaiorSaldo(List<Conta2> contas) {
        if (contas.isEmpty()) return null;
        Conta2 maior = contas.get(0);
        for (Conta2 conta : contas) {
            if (conta.getSaldo() > maior.getSaldo()) {
                maior = conta;
            }
        }
        return maior;
    }
}
