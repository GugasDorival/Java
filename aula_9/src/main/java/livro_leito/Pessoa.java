package livro_leito;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa() {
    }
    
    public Pessoa(String n, int i, String s) {
        this.nome = n;
        this.idade = i;
        this.sexo = s;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String n) {
        this.nome = n;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int i) {
        this.idade = i;
    }
    
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String s) {
        this.sexo = s;
    }

    public void fazerAniver(){
        this.setIdade(this.getIdade() + 1);
    }
}
