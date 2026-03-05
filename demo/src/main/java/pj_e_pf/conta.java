package pj_e_pf;
public class conta {
    private int numero;
    private String tipo;
    private double saldo;
    private Pessoa dono;

    public conta() {
    }

    public conta(int numero, String tipo, double saldo, Pessoa dono) {
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = saldo;
        this.dono = dono;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    public double getRendimento() {
        pf oPf;
        if (getDono() instanceof  pj) {
            return saldo * 1.1; 
        } else{
            oPf = (pf)dono;
        }
        if (oPf.isEspecial()){
            return saldo * 1.2;
        } else{
            return saldo * 1.05;
        }
    }
}