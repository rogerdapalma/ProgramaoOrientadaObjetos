package Aula06.Ex003;

public class Pessoa {
    private String nome;
    private String email;
    private String dataNascimento;
    private String endereco;
    private boolean admin;

    public Pessoa(String nome, String email, String dataNascimento, String endereco, boolean admin) {
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.admin = admin;
    }

    public String getEmail() {
        return this.email;
    }

    public void promoverAdmin() {
        this.admin = true;
    }

    public String getInfo() {
        return "Nome: " + nome + "\n" +
                "Email: " + email + "\n" +
                "Data de Nascimento: " + dataNascimento + "\n" +
                "Endereço: " + endereco + "\n" +
                "Admin: " + (admin ? "Sim" : "Não");
    }
}