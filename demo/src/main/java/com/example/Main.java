package com.example;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Condominio oCondominio = new Condominio();
        //associando objetos anonimos a linhas 
        oCondominio.setBloco(new Bloco());
        oCondominio.getBloco().setApartamento(new Apartamento());
        oCondominio.getBloco().getApartamento().setMorador(new Morador());



        System.out.println("=== CONDOMINIO ===");
        System.out.println("Informe o endereço: ");
        oCondominio.setEndereco(teclado.nextLine());

        System.out.println("Informe o número: ");
        oCondominio.setNumero(teclado.nextInt());

        teclado.nextLine();

        System.out.println("Informe a construtora: ");
        oCondominio.setConstrutora(teclado.nextLine());

        System.out.println(" ");

        System.out.println("=== BLOCO ===");
        System.out.println("Informe o número do bloco: ");
        oCondominio.getBloco().setNumero(teclado.nextInt());

        teclado.nextLine();

        System.out.println("Informe o apelido do bloco: ");
        oCondominio.getBloco().setApelido(teclado.nextLine());

        System.out.println("=== APARTAMENTO ===");
        System.out.println("Informe o andar do apartamento: ");
        oCondominio.getBloco().getApartamento().setAndar(teclado.nextInt());

        System.out.println("Informe o número do apartamento: ");
        oCondominio.getBloco().getApartamento().setNumero(teclado.nextInt());

        System.out.println("O apratamento é cobertura?");
        oCondominio.getBloco().getApartamento().setCobertura(teclado.nextBoolean());

        teclado.nextLine();

        System.out.println("=== MORADOR  ===");
        System.out.println("Informe o nome do morador: ");
        oCondominio.getBloco().getApartamento().getMorador().setNome(teclado.nextLine());

        System.out.println("Informe a idade do morador: ");
        oCondominio.getBloco().getApartamento().getMorador().setIdade(teclado.nextInt());

        System.out.println("Informe se o morador é responsável: ");
        oCondominio.getBloco().getApartamento().getMorador().setResp(teclado.nextBoolean());


        System.out.println("==== RELATÓRIO ====");
        System.out.println("==== CONDOMINIO ====");
        System.out.println("Endereço: " + oCondominio.getEndereco());
        System.out.println("Número: " + oCondominio.getNumero());
        System.out.println("Construtora: " + oCondominio.getConstrutora());

        System.out.println("\t ==== BLOCO ====");
        System.out.println("\t Número" + oCondominio.getBloco().getNumero());
        System.out.println("\t Apelido: " + oCondominio.getBloco().getApelido());

        System.out.println("\t\t ==== APRATAMENTO ====");
        System.out.println("\t\t Andar: " + oCondominio.getBloco().getApartamento().getAndar());
        System.out.println("\t\t Número: " + oCondominio.getBloco().getApartamento().getNumero());

        String cobertura = ((oCondominio.getBloco().getApartamento().isCobertura()==true)? "Sim" : "Não");
        System.out.println("\t\tCobertura " + cobertura);

        System.out.println("\t\t\t==== MORADOR ====");
        System.out.println("\t\t\tNome: " + oCondominio.getBloco().getApartamento().getMorador().getNome());
        System.out.println("\t\t\tIdade: " + oCondominio.getBloco().getApartamento().getMorador().getIdade());

        String responsavel = ((oCondominio.getBloco().getApartamento().getMorador().isResp()==true)? "Sim" : "Não");
        System.out.println("\t\t\tResponsável: "+ responsavel);
    }
}
