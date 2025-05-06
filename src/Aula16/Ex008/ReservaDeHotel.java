package Aula16.Ex008;

class ReservaDeHotel extends Reserva {
    public ReservaDeHotel(String cliente) {
        super(cliente);
    }

    @Override
    public void cancelar() {
        System.out.println("Cancelamento de hotel para " + cliente + ": taxa de 10% aplicada.");
    }
}
