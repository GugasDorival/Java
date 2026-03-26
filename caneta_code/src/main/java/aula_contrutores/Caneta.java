package aula_contrutores;

public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    //cosntrutor cheio
    public Caneta(String m, String c, float p){
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();

    }

    //cosntrutores com alguns parametros
    /*/
    public Caneta(){
        this.tampar();
        this.cor = "azul";
        this.tampada = true;
    }
    */

    //Métodos
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo (String m){
        this.modelo = m;
    }

    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }

    public String getCor(){
        return this.cor;
    }
    public void setCor(String c){
        this.cor = c;
    }

    public boolean isTampada(){
        return this.tampada;
    }
    public void setTampada(boolean t){
        this.tampada = t;
    }

    public void destambar(){
        this.tampada = false;
    }
    public void tampar(){
        this.tampada = true;
    }

    public void status(){
        System.out.println("=====SOBRE A CANETA=====");
        System.out.println("\tModelo " + this.getModelo());
        System.out.println("\tPonta " + this.getPonta());
        System.out.println("\tCor " + this.getCor());
        System.out.println("\tTampada? " + this.isTampada());
    }

}
