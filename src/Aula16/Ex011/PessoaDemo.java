package Aula16.Ex011;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class PessoaDemo {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Ana", 25, 'F'));
        pessoas.add(new Pessoa("Carlos", 30, 'M'));
        pessoas.add(new Pessoa("Beatriz", 22, 'F'));
        pessoas.add(new Pessoa("Eduardo", 28, 'M'));
        pessoas.add(new Pessoa("Rosana", 22, 'F'));
        pessoas.add(new Pessoa("Mauro", 28, 'M'));
        pessoas.add(new Pessoa("Oruam", 22, 'M'));
        pessoas.add(new Pessoa("Bella", 28, 'F'));
        pessoas.add(new Pessoa("Roberta", 22, 'F'));
        pessoas.add(new Pessoa("Roger", 28, 'M'));

        int qtdMulheres = contarMulheres(pessoas);
        System.out.println("Quantidade de mulheres: " + qtdMulheres);
    }

    public static int contarMulheres(List<Pessoa> pessoas) {
        int contador = 0;
        for (Pessoa p : pessoas) {
            if (p.getSexo() == 'F') {

                contador++;

            }
        }
        return contador;
    }
}
