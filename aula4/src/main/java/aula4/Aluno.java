package aula4;

public class Aluno extends Pessoa{
    private boolean bolsista;
    private String curso;

    public Aluno() {
    }

    public Aluno(int codigo, String nome, int idade, boolean bolsista, String curso) {
        super(codigo, nome, idade);
        this.bolsista = bolsista;
        this.curso = curso;
    }

    public boolean isBolsista() {
        return bolsista;
    }
    public void setBolsista(boolean bolsista) {
        this.bolsista = bolsista;
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }    
}