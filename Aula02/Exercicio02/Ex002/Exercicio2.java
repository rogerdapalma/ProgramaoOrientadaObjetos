package Ex002;

public class Exercicio2 {
    public static void main(String[] args) {
        int[][] tabuada = new int[10][10];
        System.out.println("Tabuada de 10x10:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tabuada[i][j] = (i + 1) * (j + 1);
                System.out.print(tabuada[i][j] + "\t");
            }
            System.out.println();
        }
    }
}