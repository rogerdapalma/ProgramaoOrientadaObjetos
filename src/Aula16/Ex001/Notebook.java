package Aula16.Ex001;

import java.util.Scanner;

class Notebook extends Computador {
    public String exibeMarca() {
        return marca;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Notebook notebook = new Notebook();
        System.out.print("Digite a marca do Notebook: ");
        notebook.marca = scanner.nextLine();
        notebook.modelo = "Portátil";

        System.out.println("Marca: " + notebook.exibeMarca());
        System.out.println("Modelo: " + notebook.exibeModelo());
    }
}
