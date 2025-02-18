
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        System.out.println("Ola mundo");

        int idade;
        idade = 18;
        char c = 'r';
        double d = 123.4;
        final float f = 3.14f;
        String nome = "Luiza";

        System.out.println(idade);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
        System.out.println(nome);

        //lendo um texto
        String texto;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um texto: ");
        texto = teclado.nextLine();

        //mostrando texto
        System.out.println("O texto digitado foi: "+texto);


        //lendo um nu;mero
        int n;
        Scanner teclado1 = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        n = teclado.nextInt();

        //mostrando numero
        System.out.println("O numero digitado foi: "+n);;

        float x;
        Scanner teclado2 = new Scanner(System.in);

    }
}
