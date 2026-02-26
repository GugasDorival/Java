package com.example;

public class Bloco {
    private int numero;
    private String apelido;
    private Apartamento apartamento; //atr associativo

    public Bloco() {

    }

    public Bloco(int pNumero, String pApelido, Apartamento pApartamento) {
        this.numero = pNumero;
        this.apelido = pApelido;
        this.apartamento = pApartamento;
    }

    public int getNumero () {
        return this.numero;
    }

    public void setNumero(int pNumero){
        this.numero = pNumero;
    }

    public String getApelido () {
        return this.apelido;
    }

    public void setApelido(String pApelido){
        this.apelido = pApelido;
    }

    public Apartamento getApartamento(){
        return this.apartamento;
    }

    public void setApartamento(Apartamento pApartamento){
        this.apartamento = pApartamento;
    }
}
