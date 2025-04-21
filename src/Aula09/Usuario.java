package Aula09;

import java.util.Scanner;

class Usuario {
    private String nomeUsuario;
    private String senha;
    private boolean logado = false;

    public Usuario(String nomeUsuario, String senha) {
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public void login(String usuario, String senha) {
        if (this.nomeUsuario.equals(usuario) && this.senha.equals(senha)) {
            logado = true;
            System.out.println("Login bem-sucedido.");
        } else {
            System.out.println("Usuário ou senha incorretos.");
        }
    }

    public void logout() {
        logado = false;
        System.out.println("Logout realizado.");
    }

    public void exibirStatus() {
        System.out.println("Usuário está logado? " + logado);
    }

    public static void main(String[] args) {
        Usuario usuario = new Usuario("admin", "1234");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome de usuário:");
        String nome = scanner.nextLine();
        System.out.println("Digite a senha:");
        String senha = scanner.nextLine();

        usuario.login(nome, senha);
        usuario.exibirStatus();
        usuario.logout();
        usuario.exibirStatus();
    }
}
