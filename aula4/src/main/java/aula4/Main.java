package aula4;

public class Main {
    public static void main(String[] args) {
    
        //Criado como pessoa, mas também é professor
        Pessoa oPessoa = new Professor(12, "Jonas", 30, "Engenharia", 5000);

            //verifica de a pessoa é pessoa        
            if (oPessoa instanceof Pessoa) {
                System.out.println("Sim"); 
            } else {
                System.out.println("Não");
            }

            //verifica de a pessoa é Professor        
            if (oPessoa instanceof Professor) {
                System.out.println("Sim"); 
            } else {
                System.out.println("Não");
            }
            //verifica de a pessoa é Aluno        
            if (oPessoa instanceof Aluno) {
                System.out.println("Sim"); 
            } else {
                System.out.println("Não");
            }
    }
}