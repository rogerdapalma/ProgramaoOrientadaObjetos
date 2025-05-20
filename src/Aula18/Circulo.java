package Aula18;

public class Circulo extends Forma{

    private double raio;

    public Circulo(double raio) {
        super();
        this.raio = raio;
    }

    @Override
    public double area() {
        return (3.14*raio)/2;
    }

    @Override
    public double perimetro() {
        return 2*3.14*raio;
    }

}