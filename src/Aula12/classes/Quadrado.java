package Aula12.classes;

public class Quadrado extends Desenho2D{
    protected String desc;

    public Quadrado(int largura, int altura, String desc) {
        super(largura, altura);
        this.desc = desc;
    }

    public void exibir() {
        System.out.printf("nome autor: %s\n", nomeAutor);
        System.out.printf("largura: %d\n", largura);
        System.out.println("altura: " + altura);
        System.out.println("desc: " + desc);

    }
}
