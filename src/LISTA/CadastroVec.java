package LISTA;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CadastroVec {

    private List<Veiculo> listaVeiculos = new ArrayList<>();
    private static final String ARQUIVO = "C:\\Users\\roger\\IdeaProjects\\ProgramaoOrientadaObjetos\\src\\LISTA\\LISTA.txt"; //caminho
    public CadastroVec() {
        carregarArquivo();
    }
    // cadastrar
    public void cadastrar(Veiculo v){
        listaVeiculos.add(v);
        salvarArquivo();
    }

    // alterar km
    public boolean alterarQuilometragem(String placa, double QuilometragemAlterada) {
        for (Veiculo v : listaVeiculos) {
            if (v.getPlaca().equalsIgnoreCase(placa)) {
                v.setQuilometragem(QuilometragemAlterada);
                salvarArquivo();
                return true;
            }
        }
        return false;
    }

    public boolean excluir(String placa) {
    boolean removido = false;
    for (int i = listaVeiculos.size() - 1; i >= 0; i--) {
        Veiculo v = listaVeiculos.get(i);
        if (v.getPlaca().equalsIgnoreCase(placa)) {
            listaVeiculos.remove(i);
            removido = true;
        }
    }
    if (removido) {
        salvarArquivo();
    }
    return removido;
}



    public void listar() {
        if (listaVeiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.");
        } else {
            for (Veiculo v : listaVeiculos) {
                System.out.println(v);
            }
        }
    }

    private void salvarArquivo() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARQUIVO))) {
            for (Veiculo v : listaVeiculos) {
                bw.write(v.getPlaca() + ";" + v.getMarca() + ";" + v.getModelo() + ";" +
                        v.getAnoFabricacao() + ";" + v.getQuilometragem());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo: " + e.getMessage());
        }
    }

    private void carregarArquivo() {
        File file = new File(ARQUIVO);
        if (!file.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(ARQUIVO))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(";");
                if (partes.length == 5) {
                    String placa = partes[0];
                    String marca = partes[1];
                    String modelo = partes[2];
                    int ano = Integer.parseInt(partes[3]);
                    double km = Double.parseDouble(partes[4]);
                    listaVeiculos.add(new Veiculo(placa, marca, modelo, ano, km));
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar arquivo: " + e.getMessage());
        }
    }
}

