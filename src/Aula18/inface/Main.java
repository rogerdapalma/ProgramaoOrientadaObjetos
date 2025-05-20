package Aula18.inface;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        System.out.println("--- Testando Cachorro ---");
        cachorro.emitirSom();
        cachorro.cuidarPatio();
        cachorro.exibirdados();

        System.out.println("\n--- Testando Gato ---");
        gato.emitirSom();
        gato.cuidarPatio();
        gato.exibirdados();
    }
}