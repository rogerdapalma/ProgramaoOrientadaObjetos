package Aula18;

public class Principal {

    public static void main(String[] args) {

        Cachorro c = new Cachorro("Mamifero", 7, "pug");

        System.out.println(c);
        c.emitirSom();
        c.cuidarPatio();



        Forma circulo = new Circulo(4.0);
        Forma retangulo = new Retangulo(3.0, 6.0);

        System.out.println("Círculo -> Área: " + circulo.area() + ", Perímetro: " + circulo.perimetro());
        System.out.println("Retângulo -> Área: " + retangulo.area() + ", Perímetro: " + retangulo.perimetro());
    }
}


