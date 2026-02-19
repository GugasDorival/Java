package com.example;

public class Main {
    public static void main(String[] args) {
        
        Casa oCasa = new Casa();

        oCasa.setEndereco("Rua Rio Branco");
        oCasa.setNumero(300);
        oCasa.setArea(30.5);

        //Morador oMorador = new Morador("Jose", 30, true);
        //oCasa.setMorador (oMorador);

        //Atrelando Morador a Casa com uso de objeto anonimo
        oCasa.setMorador (new Morador("Jose", 30, true));

        System.out.println("==== DADOS DA CASA ====");
        System.out.println("Endereço: " + oCasa.getEndereco());
        System.out.println("Número: " + oCasa.getNumero());
        System.out.println("Área: " + oCasa.getArea());

        System.out.println("\t ==== DADOS DO MORADOR ====");
        System.out.println("\t Nome: " + oCasa.getMorador().get.Nome);
        System.out.println("\t Idade: " + oCasa.getMorador().get.Idade);
        String responsavel = ( (oCasa.getMorador().isResp() == true) ? "Sim" : "Não");
        System.out.println("\t Responsável? " + responsavel);

    }
}