package Aula06.Ex001;

class Disciplina {
    private String nome;
    private int cargaHoraria;
    private String nomeProfessor;

    public Disciplina(String nome, int cargaHoraria, String nomeProfessor) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.nomeProfessor = nomeProfessor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }
}
