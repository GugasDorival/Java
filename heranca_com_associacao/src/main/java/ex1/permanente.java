package ex1;

public class permanente extends produto{
    private double perc_desvalorizacao;
    private boolean escritorio;

    public permanente(){

    }

    public permanente(double perc_desvalorizacao, boolean escritorio){
        this.perc_desvalorizacao=perc_desvalorizacao;
        this.escritorio=escritorio;
    }

    public boolean isEscritorio() {
        return escritorio;
    }
    public void setEscritorio(boolean escritorio) {
        this.escritorio = escritorio;
    }

    public double getPerc_desvalorizacao() {
        return perc_desvalorizacao;
    }
    public void setPerc_desvalorizacao(double perc_desvalorizacao) {
        this.perc_desvalorizacao = perc_desvalorizacao;
    }
}
