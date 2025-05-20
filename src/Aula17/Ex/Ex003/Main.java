package Aula17.Ex.Ex003;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pessoa2> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa2("Ana", 25, 'F'));
        pessoas.add(new Pessoa2("Carlos", 30, 'M'));
        pessoas.add(new Pessoa2("Beatriz", 22, 'F'));
        pessoas.add(new Pessoa2("João", 28, 'M'));

        int quantidadeMulheres = contarMulheres(pessoas);
        System.out.println("Quantidade de mulheres: " + quantidadeMulheres);
    }

    public static int contarMulheres(List<Pessoa2> pessoas) {
        int contador = 0;
        for (Pessoa2 pessoa : pessoas) {
            if (Character.toUpperCase(pessoa.getSexo()) == 'F') {
                contador++;
            }
        }
        return contador;
    }
}
