package com.example;

public class Condominio {
    private String endereco;
    private int numero;
    private String construtora;
    private Bloco bloco;

    public Condominio(){

    }

    public Condominio(String pEndereco,int pNumero,String pConstrutora,Bloco pBloco) {
        this.endereco = pEndereco;
        this.numero = pNumero;
        this.construtora = pConstrutora;
        this.bloco = pBloco;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public void setEndereco(String pEndereco) {
        this.endereco = pEndereco;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int pNumero) {
        this.numero = pNumero;
    }

    public String getConstrutora(){
        return this.construtora;
    }

    public void setConstrutora(String pConstrutora){
        this.construtora=pConstrutora;
    }

    public Bloco getBloco() {
        return this.bloco;
    }

    public void setBloco(Bloco pBloco){
        this.bloco=pBloco;
    }
}
