package com.example;

public class Main {
    public static void main(String[] args) {
        //Solução 1 (com cosntrutor vazio e metodos set())
        /*
        Equacao equ = new Equacao();

        equ.setVariavel_a (-3.2);
        equ.setVariavel_b (-5.1);
        equ.setVariavel_c (4.0);
        */

        //Solução 2 (usando construtor cheio) 
         
        try {
            Equacao equ = new Equacao (1, 2, -3);

            double [] valores = new double [2];

            valores = equ.getSolucao();

            System.out.println ("X1: " + valores[0]);
            System.out.println ("X2: " + valores[1]);
        } catch (Exception ex) {
            System.out.println ("Erro não previsto: " + ex.getMessage());
        }
        
    }
}