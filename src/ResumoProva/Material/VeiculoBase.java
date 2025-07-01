package ResumoProva.Material;

abstract class VeiculoBase implements Exibivel{
    private String placa;
    private int ano;

    public VeiculoBase(String placa, int ano){
        this.placa = placa;
        this.ano = ano;
    }

    public String getPlaca(){
        return placa;
    }
    public int getAno(){
        return ano;
    }

    public abstract void exibirDetalhes();
}

//teste

class QuilometragemInvalidaException extends Exception {
    public QuilometragemInvalidaException(String msg) {
        super(msg);
    }
}
