package Aula16.Ex007;

class NotificacaoEmail extends Notificacao {
    @Override
    public void enviar() {
        System.out.println("Enviando e-mail padrão...");
    }

    public void enviar(String destinatario) {
        System.out.println("Enviando e-mail para: " + destinatario);
    }

    public void enviar(String[] destinatarios) {
        for (String d : destinatarios) {
            System.out.println("Enviando e-mail para: " + d);
        }
    }
}
