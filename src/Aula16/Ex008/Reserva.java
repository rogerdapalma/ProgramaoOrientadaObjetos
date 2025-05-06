package Aula16.Ex008;

public class Reserva {
    protected  String cliente;

    public Reserva(String cliente) {
        this.cliente = cliente;
    }
    public void adicionar(){
        System.out.printf("Adicionando: %s\n", cliente);
    }

    public void cancelar(){
        System.out.printf("Cancela Reserva: %s\n", cliente);
    }
}
