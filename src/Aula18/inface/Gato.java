package Aula18.inface;

public class Gato implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("Mial mial");
    }

    @Override
    public void cuidarPatio() {
        System.out.println("Gato não cuida do pátio");
    }

    @Override
    public void exibirdados() {
        System.out.println("gato");
        System.out.println("nome " + nome);
        System.out.println("idade " + idade);
    }
}
