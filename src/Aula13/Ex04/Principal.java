package Aula13.Ex04;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a marca do Notebook: ");
        String marcaNotebook = scanner.nextLine();
        Notebook notebook = new Notebook(marcaNotebook);
        notebook.exibirInformacoes();

        System.out.print("\nDigite a marca do Tablet: ");
        String marcaTablet = scanner.nextLine();
        Tablet tablet = new Tablet(marcaTablet);
        tablet.exibirInformacoes();

        scanner.close();
    }
}