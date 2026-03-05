package aula4;

public class Pessoa {
    protected int codigo;
    protected String nome;
    protected int idade;

    public Pessoa () {
    }

    public Pessoa(int codigo, String nome, int idade) {
        this.codigo = codigo;
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }
    public int getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}