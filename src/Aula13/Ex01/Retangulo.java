package Aula13.Ex01;

public class Retangulo extends Figura {
    double largura;
    double altura;

    public Retangulo(String cor, boolean preenchido, double largura, double altura) {
        super(cor, preenchido);
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }
}
