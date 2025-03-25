package Aula06.Ex002;

class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("1984", "George Orwell", 1949, "Distopia");
        System.out.println(livro.getInfo());

        livro.emprestar();
        System.out.println(livro.getInfo());

        livro.devolver();
        System.out.println(livro.getInfo());
    }
}
