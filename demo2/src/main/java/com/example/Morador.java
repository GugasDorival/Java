package com.example;

public class Morador {

    //atributos
    private String Nome;
    private int Idade;
    private Boolean Resp;

    //cosntrutores

    //sem parâmetros
    public Morador(){

    } 

    //com parâmetros
    public Morador (String pNome, int pIdade, Boolean pResp){
        this.Nome = pNome;
        this.Idade = pIdade;
        this.Resp = pResp;
    }

    //GET e SET
    public String getNome() {
        return Nome;
    }
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdade() {
        return Idade;
    }
    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public void setResp(Boolean pResp) {
        this.Resp = pResp;
    }
    public boolean isResp (){
        return this.Resp;
    }
}