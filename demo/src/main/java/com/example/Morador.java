package com.example;

public class Morador {
    private String nome;
    private int idade;
    private boolean resp;

    public Morador() {

    }

    public Morador(String pNome, int pIdade, boolean pResp) {
        this.nome = pNome;
        this.idade = pIdade;
        this.resp = pResp;
    }

    public String getNome () {
        return this.nome;
    }

    public void setNome(String pNome) {
        this.nome = pNome;
    }

    public int getIdade () {
        return this.idade;
    }

    public void setIdade(int pIdade) {
        this.idade = pIdade;
    }

    public boolean isResp () {
        return this.resp;
    }

    public void setResp(boolean pResp) {
        this.resp = pResp;
    }
}