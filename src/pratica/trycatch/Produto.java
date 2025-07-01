package pratica.trycatch;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) throws PrecoInvalidoException {
        this.nome = nome;
        setPreco(preco);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco)throws PrecoInvalidoException {
        if(preco < 0){
            throw new PrecoInvalidoException("preço nao pode ser negativo");
        }
        this.preco = preco;
    }

    public void exibirInformacoes(){
        System.out.println("produto: " + nome + " preco: " + preco );
    }
}
