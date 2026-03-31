package uec;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;  

    public Lutador(){

    }   
    
    public Lutador(String m, String n, int i, float a, float p, int v, int d, int e){
        this.nome = m;
        this.nacionalidade = n;
        this.idade = i;
        this.altura = a;
        this.setPeso(p);
        this.vitorias = v;
        this.derrotas = d;
        this.empates = e;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String m){
        this.nome = m;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String n) {
        this.nacionalidade = n;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int i) {
        this.idade = i;
    }

    public float getAltura() {
        return altura;
    }
    public void setAltura(float a) {
        this.altura = a;
    }

    public float getPeso() {
        return peso;
    }
    public void setPeso(float p) {
        this.peso = p;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }
    private void setCategoria() {
        if (this.getPeso() < 5.2){
            this.categoria = "Inválido";
        }else if(this.getPeso() <= 70.3){
            this.categoria = "Leve";
        }else if(getPeso() <=83.9){
            this.categoria = "Médio";
        }else if (getPeso() <= 120.2){
            this.categoria = "Pesado";
        }
    }

    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int v) {
        this.vitorias = v;
    }

    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int d) {
        this.derrotas = d;
    }

    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int e) {
        this.empates = e;
    }


    public void apresentar(){
        System.out.println("================================================");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(this.getIdade() + " Anos");
        System.out.println(this.getAltura() + "m de altura");
        System.out.println("Pesando: " + this.getPeso() + "Kg");
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpates());
    }

    public void status(){
        System.out.println("================================================");
        System.out.println(this.getNome());
        System.out.println("é um peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " vitórias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
}