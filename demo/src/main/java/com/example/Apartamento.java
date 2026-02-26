package com.example;

public class Apartamento {
    private int andar;
    private int numero;
    private boolean cobertura;
    private Morador morador; //atr associativo

    public Apartamento() {

    }

    public Apartamento(int pAndar,int pNumero,boolean pCobertura,Morador pMorador) {
        this.andar = pAndar;
        this.numero = pNumero;
        this.cobertura = pCobertura;
        this.morador = pMorador;
    }

    public int getAndar() {
        return this.andar;
    }

    public void setAndar(int pAndar) {
        this.andar = pAndar;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int pNumero) {
        this.numero = pNumero;
    }

    public boolean isCobertura() {
        return this.cobertura;
    }

    public void setCobertura(boolean pCobertura) {
        this.cobertura = pCobertura;
    }

    public Morador getMorador() {
        return this.morador;
    }

    public void setMorador(Morador pMorador) {
        this.morador = pMorador;
    }
}
