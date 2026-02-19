package com.example;

public class Casa {

    //atributo
    private String endereco;
    private int numero;
    private double area;

    private Morador morador; //atributo associativo para a classe Morador 
    
    //Construtores

    //sem parâmetros
    public Casa(){

    }

    //com parâmetros
    public Casa(String pEndereco, int pNumero, double pArea, Morador pMorador){
        this.endereco=pEndereco;
        this.numero=pNumero;
        this.area=pArea;
        this.morador = pMorador;
    }  

    //GET e SET
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getEndereco() {
        return endereco;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }
    
    public void setArea(double area) {
        this.area = area;
    }
    public double getArea() {
        return area;
    }
}