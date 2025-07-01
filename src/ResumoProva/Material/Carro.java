package ResumoProva.Material;

class Carro extends VeiculoBase {
    private String modelo;
    private double quilometragem;

    public Carro(String placa, int ano, String modelo, double km) throws QuilometragemInvalidaException {
        super(placa, ano);
        this.modelo = modelo;
        setQuilometragem(km);
    }

    public void setQuilometragem(double km) throws QuilometragemInvalidaException {
        if (km < 0) {
            throw new QuilometragemInvalidaException("Quilometragem não pode ser negativa.");
        }
        this.quilometragem = km;
    }
public double getQuilometragem(){
        return quilometragem;

    }
    @Override
    public void exibirDetalhes() {
        System.out.println("Modelo: " + modelo + ", Ano: " + getAno() + ", Quilometragem: " + getQuilometragem());
    }
    @Override
    public String toString() {
        return "Carro [modelo=" + modelo + ", quilometragem=" + quilometragem + "]";
    }
    public static Carro fromString(String linha) throws QuilometragemInvalidaException {
        String[] p = linha.split(";");
        return new Carro(p[0], Integer.parseInt(p[1]), p[2], Double.parseDouble(p[3]));
    }
}
