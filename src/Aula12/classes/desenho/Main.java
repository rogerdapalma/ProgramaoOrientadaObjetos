package Aula12.classes.desenho;

import Aula12.classes.Quadrado;

public class Main {
    public static void main(String[] args) {
        Quadrado q = new Quadrado(100,200, "Computador-ricardo");
        q.setNomeAutor("Ricardo");
        q.exibir();
    }
}
