package Aula16.Ex008;

class ReservaDeVoo extends Reserva {
    public ReservaDeVoo(String cliente) {
        super(cliente);
    }

    public void adicionar(String classe) {
        System.out.println("Reserva de voo para " + cliente + " na classe: " + classe);
    }

    @Override
    public void cancelar() {
        System.out.println("Cancelamento de voo para " + cliente + ": reembolso parcial disponível.");
    }
}