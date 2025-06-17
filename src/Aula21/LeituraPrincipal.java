package Aula21;

import java.io.*;

public class LeituraPrincipal {
    public static void main(String[] args) {
        try {
            FileReader arquivo = new FileReader("C:\\Users\\roger\\IdeaProjects\\ProgramaoOrientadaObjetos\\src\\Aula21\\alunos.txt");
            BufferedReader leitor = new BufferedReader(arquivo);

            System.out.println("Leitura do arquivo:");

            String linha;
            while((linha = leitor.readLine()) != null){
                String[] campos = linha.split(",");

                String nome = campos[0];
                int idade = Integer.parseInt(campos[1]);

                Aluno a = new Aluno(nome, idade);
                System.out.println("Nome: " + a.getNome() + "\nIdade: " + a.getIdade());
            }
            leitor.close();
            arquivo.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
