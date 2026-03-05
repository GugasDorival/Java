package aula4;

public class Professor extends Pessoa{
    private String formacao;
    private double salario;

    public Professor() {
    }

    public Professor(int codigo, String nome, int idade, String formacao, double salario) {
        super(codigo, nome, idade);
        this.formacao = formacao;
        this.salario = salario;
    }

    public String getFormacao() {
        return formacao;
    }
    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}