package Aula21;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Roger", 20);
        Aluno a2 = new Aluno("Maria", 21);
        Aluno a3 = new Aluno("Jorge", 19);

        try {
            FileWriter arquivo = new FileWriter("C:\\Users\\roger\\IdeaProjects\\ProgramaoOrientadaObjetos\\src\\Aula21\\alunos.txt",true);// add sempre no final novas coisas
            BufferedWriter escritor = new BufferedWriter(arquivo);

            escritor.write(a1.getNome() + "," + a1.getIdade());
            escritor.newLine();
            escritor.write(a2.getNome() + "," + a2.getIdade());
            escritor.newLine();
            escritor.write(a3.getNome() + "," + a3.getIdade());
            escritor.newLine();

            escritor.close();
            arquivo.close();
            System.out.println("alunos salvos no arquivo.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}