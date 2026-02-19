package com.example;

public class Equacao {

    //atributo
    private double Variavel_a; 
    private double Variavel_b;
    private double Variavel_c;
    private double [] vsolução = new double [2]; //Vetor

    //métodos construtores 

    //sem parâmetros criados 
    public Equacao(){

    }
     
    //com parâmetros criados
    public Equacao (double pVariavel_a, double pVariavel_b, double pVariavel_c){
        this.Variavel_a = pVariavel_a;
        this.Variavel_b = pVariavel_b;
        this.Variavel_c = pVariavel_c;
    }

    //GET e SET
    public double getVariavel_a(){
        return this.Variavel_a;
    }
    public void setVariavel_a (double pVariavel_a){
        this.Variavel_a = pVariavel_a;
    }

    public double getVariavel_b(){
        return this.Variavel_b;
    }
    public void setVariavel_b (double pVariavel_b){
        this.Variavel_b = pVariavel_b;
    }

    public double getVariavel_c(){
        return this.Variavel_c;
    }
    public void setVariavel_c (double pVariavel_c){
        this.Variavel_c = pVariavel_c;
    }

    //equacão De Delta
    private double getDelta(){
        double Delta = Math.pow (this.Variavel_b, 2) - 4*this.Variavel_a*this.Variavel_c;
        
        if (Delta < 0) {
            System.out.println("Delta menor que zero (Solução impossível)");
        }
        
        return Delta;
    }


    /*
    public void getSolução(){
        double x1 = ((-1*this.Variavel_b + Math.sqrt(this.getDelta()))/(2*this.Variavel_a));
        double x2 = ((-1*this.Variavel_b - Math.sqrt(this.getDelta()))/(2*this.Variavel_a));
        
        System.out.println("x1: " + x1);
        System.out.println("x1: " + x2);
    }
    */
    public double[] getSolucao() {
        this.vsolução[0] = (-1*this.Variavel_b + Math.sqrt(this.getDelta()))/(2*this.Variavel_a);
        this.vsolução[1] = (-1*this.Variavel_b - Math.sqrt(this.getDelta()))/(2*this.Variavel_a);

        return this.vsolução;
    }

}
