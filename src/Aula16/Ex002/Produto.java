package Aula16.Ex002;

class Produto {
    protected double preco;

    public Produto(double preco) {
        this.preco = preco;
    }

    public void desconto() {
        System.out.printf("Preço original: R$ %.2f\n", preco);
    }
}
