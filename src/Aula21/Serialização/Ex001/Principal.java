package Aula21.Serialização.Ex001;

import java.io.*;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto("ABC123","Exemplo produto", 9.99 , "caso temporario");

        //serilização
        try {
            FileOutputStream arquivoSaida = new FileOutputStream("C:\\Users\\roger\\IdeaProjects\\ProgramaoOrientadaObjetos\\src\\Aula21\\Serialização\\produto.ser");
            ObjectOutputStream objetoSaida = new ObjectOutputStream(arquivoSaida);

            objetoSaida.writeObject(produto);
            objetoSaida.close();
            arquivoSaida.close();
            System.out.println("Objeto serializado em produto.ser!");
        } catch (IOException e ){
            e.printStackTrace();
        }

        // desserialização
        try {
            FileInputStream arquivoEntrada = new FileInputStream("C:\\Users\\roger\\IdeaProjects\\ProgramaoOrientadaObjetos\\src\\Aula21\\Serialização\\produto.ser");
            ObjectInputStream objetoEntrada = new ObjectInputStream(arquivoEntrada);

            Produto produtoDesserializado = (Produto) objetoEntrada.readObject();
            objetoEntrada.close();
            arquivoEntrada.close();
            System.out.println("Produto desserializado: " + produtoDesserializado);
        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }


    }
}
