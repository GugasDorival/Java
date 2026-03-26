package aula_contrutores;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC", "Verde", 0.6f);
        Caneta c2 = new Caneta("JUDAS", "Amarela", 0.7f);
        
        c1.status();
        
        System.out.println("\n");

        c2.status();

        /* 
        //usando o método 'SET'
        c1.setModelo("BIC"); 

        //mexendo no prórpio atributo
        //se não for public, não funciona
        //c1.modelo="BIC";

        c1.setPonta(0.5f);

        c1.status();
        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
        */
    }
}