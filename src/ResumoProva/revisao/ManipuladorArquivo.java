package ResumoProva.revisao;

import java.io.*;

class ManipuladorArquivo {
    public void gravar(String caminho, String conteudo) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(caminho));
        bw.write(conteudo);
        bw.close();
    }

    public String ler(String caminho) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(caminho));
        String linha = br.readLine();
        br.close();
        return linha;
    }
}