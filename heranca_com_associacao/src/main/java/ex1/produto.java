package ex1;

public class produto {
    protected int codigo;
    protected String descricao;
    protected double valor_unit;

    public produto(){

    }

    public produto(int codigo, String descricao, double valor_unit){
        this.codigo=codigo;
        this.descricao=descricao;
        this.valor_unit=valor_unit;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }

    public void setValor_unit(double valor_unit) {
        this.valor_unit = valor_unit;
    }
    public double getValor_unit() {
        return valor_unit;
    }

}