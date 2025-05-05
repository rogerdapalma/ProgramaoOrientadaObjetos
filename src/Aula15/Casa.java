package Aula15;

class Casa {
    public int calcularPreco(int tamanho) {
        return tamanho * 1000;
    }

    public int calcularPreco(int tamanho, int quartos) {
        return tamanho * 1000 + quartos * 5000;
    }
}