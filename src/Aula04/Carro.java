package Aula04;

// Classe Carro
    public class Carro {
    public String marca;
    public String modelo;
    public boolean alugado;

    public boolean vereficaAlugado() {
        return alugado;
    }
    public void alugar() {
        if (!vereficaAlugado()) {
            alugado = true;
            System.out.println("Carro alugado");
        }
        else {
            System.out.println("carro indisponivel para locação");
        }
    }

    public void devolver() {
        if (vereficaAlugado()) {
            alugado = false;
            System.out.println("Carro devolvido");
        }
        else {
            System.out.println("carro nao alugado, não é possivel devolver");
        }

    }

    public void exibirDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("alugado: " + alugado);
    }

}
