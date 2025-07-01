package AvaliaçãoIII;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CadastroVeiculos {
    private static final String ARQUIVO = "C:\\Users\\roger\\IdeaProjects\\ProgramaoOrientadaObjetos\\src\\AvaliaçãoIII\\veiculos.ser";
    private List<Veiculo> veiculos;

    //carregando arquivo
    public CadastroVeiculos() {
        veiculos = carregarArquivo();
    }
    //salva no arquivo
    public void cadastrar(Veiculo v) {
        veiculos.add(v);
        salvarArquivo();

    }

    public boolean alterar(String placa, double QuilometragemAleterada) {
        for (Veiculo v : veiculos) {
            if (v.getPlaca().equalsIgnoreCase(placa)) {
                v.setQuilometragem(QuilometragemAleterada);
                salvarArquivo();
                return true;
            }
        }
        return false;
    }

    public boolean excluir(String placa) {
        boolean removido = false;
        for (int i = veiculos.size() - 1; i >= 0; i--) {
            Veiculo v = veiculos.get(i);
            if (v.getPlaca().equalsIgnoreCase(placa)) {
                veiculos.remove(i);
                removido = true;
            }
        }
        if (removido) {
            salvarArquivo();
        }
        return removido;
    }

    public void listar() {
        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.");
        } else {
            for (Veiculo v : veiculos) {
                System.out.println(v);
            }
        }
    }

    private void salvarArquivo() {
        JSONArray jsonArray = new JSONArray();
        for (Veiculo v : veiculos) {
            JSONObject json = new JSONObject();
            json.put("placa", v.getPlaca());
            json.put("modelo", v.getModelo());
            json.put("marca", v.getMarca());
            json.put("anoFabricacao", v.getAnoFabricacao());
            json.put("quilometragem", v.getQuilometragem());
            jsonArray.add(json);
        }

        try (FileWriter fileWriter = new FileWriter(ARQUIVO)) {
            fileWriter.write(jsonArray.toJSONString());
            System.out.println("Arquivo veiculos.json salvo com sucesso.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<Veiculo> carregarArquivo() {
        List<Veiculo> lista = new ArrayList<>();
        try (FileReader reader = new FileReader(ARQUIVO)) {
            JSONParser parser = new JSONParser();
            JSONArray jsonArray = (JSONArray) parser.parse(reader);

            for (Object obj : jsonArray) {
                JSONObject jsonObj = (JSONObject) obj;
                String placa = (String) jsonObj.get("placa");
                String modelo = (String) jsonObj.get("modelo");
                String marca = (String) jsonObj.get("marca");
                long ano = (long) jsonObj.get("anoFabricacao");
                double km = (double) jsonObj.get("quilometragem");
                lista.add(new Veiculo(placa, modelo, marca, (int) ano, km));
            }

            System.out.println("Arquivo veiculos.json iniciando.");
        } catch (Exception e) {
            System.out.println("Arquivo vazio ou não encontrado.");
        }
        return lista;
    }

}