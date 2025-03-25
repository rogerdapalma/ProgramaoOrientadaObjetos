package Aula06.Ex003;

class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Ana", "ana@email.com", "1990-05-12", "Rua Astro, 423", false);
        Pessoa pessoa2 = new Pessoa("Bruno", "bruno@email.com", "1985-09-30", "Rua Boni, 456", false);

        pessoa1.promoverAdmin();

        System.out.println("Pessoa 1:\n" + pessoa1.getInfo());
        System.out.println("\nPessoa 2:\n" + pessoa2.getInfo());
    }
}
