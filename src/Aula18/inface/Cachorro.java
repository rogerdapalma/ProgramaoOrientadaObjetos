package Aula18.inface;

public class Cachorro implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au,Au");
    }

    @Override
    public void cuidarPatio() {
        System.out.println("Cuidando patio....");
    }

    @Override
    public void exibirdados() {
        System.out.println("cachorrro");
        System.out.println("nome " + nome);
        System.out.println("idade " + idade);
    }
}

