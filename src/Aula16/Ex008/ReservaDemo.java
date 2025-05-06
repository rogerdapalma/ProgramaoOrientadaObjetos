package Aula16.Ex008;

public class ReservaDemo {
    public static void main(String[] args) {
        Reserva[] reservas = new Reserva[3];

        reservas[0] = new ReservaDeHotel("Carlos");
        reservas[1] = new ReservaDeVoo("Ana");
        reservas[2] = new ReservaDeVoo("Bruno");

        for (Reserva r : reservas) {
            r.adicionar();
        }

        System.out.println();

        ((ReservaDeVoo) reservas[1]).adicionar("Econômica");
        ((ReservaDeVoo) reservas[2]).adicionar("Executiva");

        System.out.println();

        for (Reserva r : reservas) {
            r.cancelar();
        }
    }
}