package pj_e_pf;

public class pj extends Pessoa{
    private int cnpj;
    private String razao;

    public pj() {
    }

    public pj(String nome, int idada, int cnpj, String razao) {
        super(nome, idada);
        this.cnpj = cnpj;
        this.razao = razao;
    }

    public int getCnpj() {
        return cnpj;
    }
    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazao() {
        return razao;
    }                           
    public void setRazao(String razao) {
        this.razao = razao;
    }
}
