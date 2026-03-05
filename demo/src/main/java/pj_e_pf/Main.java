package pj_e_pf;

public class Main {
    public static void main(String[] args) {
        Pessoa oPessoa1 = new pf("Rossi", 35, 1245789658, true);
        Pessoa oPessoa2 = new pj("Mario", 50, 55555, "JTC Limitada");
        Pessoa oPessoa3 = new pf("José", 70, 125478964, false);
    
        conta oConta1 = new conta(0001, "Corrente", 1000, oPessoa1);
        conta oConta2 = new conta(0002, "Poupança", 2000, oPessoa2);
        conta oConta3 = new conta(0003, "Corrente", 3000, oPessoa3);

        System.out.println("Rendimento1: " + oConta1.getRendimento());
        System.out.println("\nRendimento2: " + oConta2.getRendimento());
        System.out.println("\nRendimento3: " + oConta3.getRendimento());
    }     
}