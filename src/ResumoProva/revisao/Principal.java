package ResumoProva.revisao;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        try {
            // Classe, objeto, atributos, métodos, encapsulamento, herança, interface
            Cachorro dog = new Cachorro("Canis", 5, "Pastor Alemão");
            dog.emitirSom();
            dog.cuidar();
            dog.exibeDados();

            // Polimorfismo por sobrecarga
            Calculadora calc = new Calculadora();
            System.out.println("Soma int: " + calc.somar(2,3));
            System.out.println("Soma double: " + calc.somar(2.5,3.7));

            // Lista (ArrayList)
            List<Cliente> clientes = new ArrayList<>();
            clientes.add(new Cliente("Alice", 30));
            clientes.add(new Cliente("Bob", 25));

            for (Cliente c : clientes) {
                System.out.println("Cliente: " + c);
            }

            // Arquivos
            ManipuladorArquivo m = new ManipuladorArquivo();
            m.gravar("dados.txt", "Hello Java File");
            String conteudo = m.ler("dados.txt");
            System.out.println("Arquivo: " + conteudo);

            // Serialização
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("clientes.ser"));
            out.writeObject(clientes);
            out.close();

            // Desserialização
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("clientes.ser"));
            List<Cliente> clientesLidos = (List<Cliente>) in.readObject();
            in.close();
            System.out.println("Clientes desserializados:");
            for (Cliente c : clientesLidos) {
                System.out.println(c);
            }

            // Tratamento de exceções personalizadas
            double saldo = 100.0;
            double saque = 200.0;
            if (saque > saldo) {
                throw new SaldoInsuficienteException("Saldo insuficiente para saque de " + saque);
            }

        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro de arquivo ou serialização: " + e.getMessage());
        }
    }
}

