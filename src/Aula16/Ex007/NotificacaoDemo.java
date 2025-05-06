package Aula16.Ex007;

public class NotificacaoDemo {
    public static void main(String[] args) {
        Notificacao notificacaoGenerica = new Notificacao();
        notificacaoGenerica.enviar();

        NotificacaoEmail email = new NotificacaoEmail();
        email.enviar();
        email.enviar("joao@exemplo.com");
        email.enviar(new String[]{"ana@exemplo.com", "maria@exemplo.com"});

        NotificacaoApp app = new NotificacaoApp();
        app.enviar();
    }
}