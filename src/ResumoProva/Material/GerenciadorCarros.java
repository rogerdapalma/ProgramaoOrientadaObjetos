package ResumoProva.Material;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class GerenciadorCarros {
    private List<Carro> lista = new ArrayList<>();
    private final String ARQUIVO = "C:\\Users\\roger\\IdeaProjects\\ProgramaoOrientadaObjetos\\src\\AvaliaçãoIII\\Material\\carros.txt";

    public GerenciadorCarros() {
        carregar();
    }

    public void adicionar(Carro c) {
        lista.add(c);
        salvar();
    }

    public void listar() {
        if (lista.isEmpty()) {
            System.out.println("Nenhum carro cadastrado.");
        } else {
            for (Carro c : lista) {
                c.exibirDetalhes();
            }
        }
    }

    private void salvar() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(ARQUIVO))) {
            for (Carro c : lista) {
                pw.println(c);
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar: " + e.getMessage());
        }
    }

    private void carregar() {
        File f = new File(ARQUIVO);
        if (!f.exists()) return;
        try (BufferedReader br = new BufferedReader(new FileReader(ARQUIVO))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                try {
                    lista.add(Carro.fromString(linha));
                } catch (QuilometragemInvalidaException e) {
                    System.out.println("Erro em linha do arquivo: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar: " + e.getMessage());
        }
    }
}