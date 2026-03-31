package uec;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador dd) {
        this.desafiado = dd;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador d) {
        this.desafiante = d;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int r) {
        this.rounds = r;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean a) {
        this.aprovada = a;
    }

    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria() == l2.getCategoria() && (l1 != l2)){
            this.setAprovada(true);
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
            this.setAprovada(false);
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar(){
        if (this.isAprovada() == true){
            System.out.println("###DESAFIADO###");
            this.desafiado.apresentar();
            System.out.println("###DESAFIANTE###");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
                case 0:
                    System.out.println("Empate!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("Vencedor: " + this.getDesafiado().getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("Vecedor: " + this.getDesafiante().getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
        }else{
            System.out.println("Luta não aprovada");
        }
    }
}