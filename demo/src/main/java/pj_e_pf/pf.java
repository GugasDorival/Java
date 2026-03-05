package pj_e_pf;

public class pf extends Pessoa{
    private  int cpf;
    private boolean especial;

    public pf() {
    }

    public pf(String nome, int idada, int cpf, boolean especial) {
        super(nome, idada);
        this.cpf = cpf;
        this.especial = especial;
    }

    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public boolean isEspecial() {
        return especial;
    }
    public void setEspecial(boolean especial) {
        this.especial = especial;
    }
}